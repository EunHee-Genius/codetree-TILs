import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 1;

        for(int i=1; i<=m; i++){
            result *= n;
        }
        System.out.println(result);
    }
}