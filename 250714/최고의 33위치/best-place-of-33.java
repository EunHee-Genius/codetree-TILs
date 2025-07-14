import java.util.*;

public class Main {

//    public static int n;
    public static final int MAX_N = 20;
//    public static int goldNum;
    public static int[][] grid = new int[MAX_N][MAX_N];

    public static int func(int rowStart, int colStart, int rowEnd, int colEnd){
        int goldNum = 0;
        for(int i = rowStart; i <= rowEnd; i++){
            for(int j = colStart; j <= colEnd; j++){
                goldNum += grid[i][j];
            }
        }
        return goldNum;
    }

    public static void main(String[] args) {
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                    if(i+2 >= n || j+2 >= n){
                        continue;
                    }
                int goldNum = func(i, j, i+2, j+2);
            cnt = Math.max(cnt, goldNum);
                }
            }
            System.out.println(cnt);
        }
    }