import java.util.*;

public class Main {
    
    // 0. 상수 선언
    public static final int MAX_N = 20;
    public static int[][] grid = new int[MAX_N][MAX_N];

    // 3. 금 갯수 세는 함수 만들기 (금 갯수 리턴)
    public static int func(int rowS, int colS, int rowE, int colE){
        int numOfGold = 0;

        for(int row = rowS; row <= rowE; row++){
            for(int col = colS; col<=colE; col++){
                numOfGold += grid[row][col];
            }
        }
        return numOfGold;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxGold = 0;

        // 1. 횟수 입력받기
        int n = sc.nextInt();
        // 2. 2차원 배열 입력받기
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                grid[row][col] = sc.nextInt();
            }
        }
        // 4. 조건을 충족하는 배열을 싹 돌면서 maxGold를 선언하여 최대의 금 갯수를 저장한다.
    for(int row = 0; row < n; row++){
        for(int col = 0; col < n; col++){
            if(row + 2 >= n || col + 2 >= n){
                continue;
            }
            int numOfGold = func(row, col, row+2, col+2);

            maxGold = Math.max(maxGold, numOfGold);
        }
    }
    // 5. 그걸 뿌려준다
    System.out.println(maxGold);
    }
}