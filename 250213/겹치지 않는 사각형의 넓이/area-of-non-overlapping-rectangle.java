import java.util.*;

public class Main {

    public static final int MAX_VAL = 2001;
    public static int n;
    public static int[][] arr = new int[MAX_VAL][MAX_VAL];
    public static int OFFSET = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int k = 0; k <= 1; k++){
            int x1 = sc.nextInt()+OFFSET;
            int y1 = sc.nextInt()+OFFSET;
            int x2 = sc.nextInt()+OFFSET;
            int y2 = sc.nextInt()+OFFSET;

            for(int i = x1; i < x2; i++){
                for(int j = y1; j < y2; j++){
                    arr[i][j]++;
                }
            }
        }
        int x1 = sc.nextInt()+OFFSET;
        int y1 = sc.nextInt()+OFFSET;
        int x2 = sc.nextInt()+OFFSET;
        int y2 = sc.nextInt()+OFFSET;

        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                arr[i][j]--;
            }
        }

        int cnt = 0;
        for(int i = 0; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == 1){
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}