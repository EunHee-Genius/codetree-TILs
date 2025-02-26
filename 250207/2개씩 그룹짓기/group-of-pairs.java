import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n*2];
        int[] sum = new int[n];
        for(int i = 0; i < n*2; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            sum[i] = arr[i] + arr[2*n-1-i];
        }
        Arrays.sort(sum);
        System.out.println(sum[n-1]);
    }
}