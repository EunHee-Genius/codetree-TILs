import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int box = sc.nextInt();
        int mr = sc.nextInt();
        int[] arr = new int[100];
        Arrays.fill(arr, 0);
        int cnt = 0;

        for(int i = 0; i < mr; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j <= b; j++){
                arr[j] += 1;
            }
        }

        for(int i = 1; i <arr.length; i++){
            if(arr[i-1] > arr[i]){
                System.out.println(arr[i-1]);
            }
        }
    }
}