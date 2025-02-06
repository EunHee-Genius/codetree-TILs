import java.util.*;

public class Main {

    public static int func(int n){
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        else{
            return func(n/3) + func(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }
}