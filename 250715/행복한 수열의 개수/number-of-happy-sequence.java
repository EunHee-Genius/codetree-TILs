import java.util.*;

public class Main {

    public static final int MAX_N = 100;
    public static final int MAX_M = 100;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int[] seq = new int[MAX_N];
    public static int n, m;

    public static boolean func(){
        int con = 1;
        int maxcnt = 1;

        for(int i = 1; i < n; i++){
            if(seq[i-1] == seq[i]){
                con++;
            }else{
                con = 1;
            }
            maxcnt = Math.max(maxcnt, con);
        }
        return maxcnt >= m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                grid[row][col] = sc.nextInt();
            }
        }
        int numHappy = 0;

        for(int i =0; i <n; i++){
            for(int j =0; j<n; j++){
                seq[j] = grid[i][j];
            }
            if(func()){
                numHappy++;
            }
        }
        for(int i =0; i <n; i++){
            for(int j =0; j<n; j++){
                seq[j] = grid[j][i];
            }
            if(func()){
                numHappy++;
            }
        }
        System.out.print(numHappy);
    }
}