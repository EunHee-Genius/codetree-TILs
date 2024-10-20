import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = func(a,b,c);
        System.out.println(x);
    }

    public static int func(int a, int b, int c){
        int result = Math.min(Math.min(a,b),c);

        return result;
    }

}