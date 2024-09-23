import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            int[] arr = new int[10];
            arr[i] = sc.nextInt();
            if (arr[i]%2 != 0){
                cnt++;
            }
        } System.out.println(cnt);
    }
}