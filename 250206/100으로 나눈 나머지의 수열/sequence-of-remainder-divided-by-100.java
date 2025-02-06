import java.util.*;

public class Main {

    public static int num = 0;

    public static int func(int n) {
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 4;
        }
        else {
            return (func(n - 1) * func(n - 2) % 100);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }
}