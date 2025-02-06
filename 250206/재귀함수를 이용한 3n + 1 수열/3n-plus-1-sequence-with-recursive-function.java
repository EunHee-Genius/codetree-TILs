import java.util.*;

public class Main {

    public static int num = 0;

    public static int func(int n) {
        if(n==1){
            return num;
        }
        if(n%2 == 0){
            num++;
            return func(n/2);
        }
        else{
            num++;
            return func(n*3+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }
}