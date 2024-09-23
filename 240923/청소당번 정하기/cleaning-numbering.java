import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int kyo = 0;
        int bok = 0;
        int hwa = 0;

        for(int i = 1; i <= n; i++){
            if(i%2==0 && i%3!=0 && i%12!=0){
                kyo++;
            }
            if(i%3==0 && i%12!=0){
                bok++;
            }
            if(i%12==0){
                hwa++;
            }
        }
        System.out.println(kyo + " " + bok + " " + hwa);
    }
}