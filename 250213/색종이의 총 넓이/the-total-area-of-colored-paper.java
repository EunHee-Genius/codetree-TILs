import java.util.*;

public class Main {

    public static final int MAX_VAL = 201;
    public static int[][] area = new int[MAX_VAL][MAX_VAL];
    public static int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int t = 0; t < n; t++){            // 입력받은 만큼 수행
            int x = sc.nextInt()+OFFSET;    // 음수 좌표가 있을수도 있으니까
            int y = sc.nextInt()+OFFSET;    // 음수 좌표가 있을수도 있으니까

            for(int i = x; i < x+8; i++){ // 면적은 8이므로 시작점에서 8만큼 추가
                for(int j = y; j < y+8; j++){ // 면적은 8이므로 시작점에서 8만큼 추가
                    area[i][j]++;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < area.length; i++){
            for(int j = 0; j < area.length; j++){
//                System.out.print(area[i][j]);
                if(area[i][j] > 0){
                    cnt++;
                }
            }
//            System.out.println();
        }
        System.out.println(cnt);
    }
}