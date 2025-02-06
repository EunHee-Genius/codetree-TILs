import java.util.*;

public class Main {

    public static int num = 0;

    public static int func(int n){
        if(n < 10){
            return n;
        }
        return func(n/10) + n % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        num = a * b * c;

        System.out.println(func(num));
    }
}