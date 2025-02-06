import java.util.*;

public class Main {

    public static int func(int n){
        if(n < 0){
            return 0;
        }
        return func(n-2) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }
}