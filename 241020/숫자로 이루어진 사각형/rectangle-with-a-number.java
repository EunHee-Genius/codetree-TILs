import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }

    public static void func(int n){
        int x = 1;

        for(int i=0; i<n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(x+ " ");
                x++;
                if(x>=10){
                    x = 1;
                }
            }System.out.println();
        }
    }
}