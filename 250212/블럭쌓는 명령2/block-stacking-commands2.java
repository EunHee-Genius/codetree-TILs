import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 총 칸 갯수
        int k = sc.nextInt();   // 명령 횟수
        int[] box = new int[n+1]; // 칸 배열
        Arrays.fill(box, 0); // 칸을 전부 0으로 채움

        // 박스에 쌓기
        for(int i = 0; i < k; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j <= b; j++){
                box[j] += 1;
            }
        }

        int value = 0;
        for(int i = 1; i < n+1; i++){
//            System.out.println(box[i]);
            if(box[i-1] < box[i]){
                value = box[i];
            }
        }
        System.out.println(value);
    }
}