import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        func(n);
    }

    public static void func(int n){
        
        int a = n/10;
        int b = n%10;

        if(n%2==0){
            if((a+b)%5 ==0){
            System.out.println("Yes");
            }
        }else{
            System.out.println("No");
        }
    }
}