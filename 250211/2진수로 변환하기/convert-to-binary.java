import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100000];
        int cnt = 0;

        while(true){
            if(n<2) {
                arr[cnt] = n;
                cnt++;
                break;
            }
            arr[cnt] = n%2;
            cnt++;
            n/=2;
        }
        for(int i = cnt-1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}