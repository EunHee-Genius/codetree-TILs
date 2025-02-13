import java.util.*;

public class Main {

    public static final int MAX_VAL = 201;
    public static final int[][] area = new int[MAX_VAL][MAX_VAL];
    public static final int OFFSET = 100;
//    public static final int MAX_VAL = 201;
//    public static int[][] area = new int[MAX_VAL][MAX_VAL];
//    public static int OFFSET = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for(int j = x1; j < x2; j++){   // i+1을 함으로써 다음꺼 색칠되게함
                    for(int k = y1; k < y2; k++){
                        area[j][k] = i+1 ;
                        }
                    }
                }
        int blue = 0;
        for(int i = 0; i < area.length; i++){
            for(int j = 0; j < area.length; j++){
                if(area[i][j] %2 == 0 && area[i][j] != 0){  // 파란색은 짝수
                    blue++;
                }
//                System.out.print(area[i][j]);
            }
        }
        System.out.println(blue);
    }
}