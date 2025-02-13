import java.util.*;

public class Main {

    public static final int MAX_VAL = 200;
    public static int n;
    public static int[][] arr = new int[MAX_VAL][MAX_VAL];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int x1 = sc.nextInt()+100;
            int y1 = sc.nextInt()+100;
            int x2 = sc.nextInt()+100;
            int y2 = sc.nextInt()+100;

            for(int x = x1; x < x2; x++){
                for(int y = y1; y < y2; y++){
                    arr[x][y] += 1;
                }
            }
        }
//        for(int i = 0; i < 10; i++){
//            for(int j = 0; j<10;j++){
//                System.out.print(arr[i][j]);
//            }System.out.println();
//        }
        int area = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] >= 1){
                    area++;
                }
            }
        }
        System.out.println(area);

    }
}