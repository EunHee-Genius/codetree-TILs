import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 1;

        for(int i=n; i<=m; i++){
            result *= i;    
        }
        System.out.println(result);
    }
}