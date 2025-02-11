import java.util.*;

public class Main {
    public static void main(String[] args){
        int ed = 0;
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        while(true) {
            if (m1 == m2 && d1 == d2) {
                break;
            }
            d1++;
            ed++;
            
            if(d1 > days[m1]){
                m1++;
                d1 = 1;
            }
        }
        System.out.println(ed+1);
    }
}