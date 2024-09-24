import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = 0;
        int sum = 0;
        double avg = 0;

        for(int i=0; i < n; i++){
            m = sc.nextInt();
            sum += m;
        }   avg = (double)sum/n;
        System.out.printf(sum + " ");
        System.out.printf("%.1f", avg);
    }
}