import java.io.*;
import java.util.*;

class Main {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int[][] arr;
    static boolean[][] check;
    static int N;
    static int M;
    static int maxValue;

    public static void checkValue(int i, int j, int sum, int blockNum) {
        if (blockNum == 3) {
            maxValue = maxValue < sum ? sum : maxValue;
        }

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                if (!check[nx][ny]) {
                    check[nx][ny] = true;
                    checkValue(nx, ny, sum + arr[nx][ny], blockNum + 1);
                    check[nx][ny] = false;
                }
            }
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        check = new boolean[N][M];

        maxValue = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j =0; j <M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                check[i][j] = true;
                checkValue(i, j, arr[i][j], 1);
                check[i][j] = false;
            }
        }

        System.out.println(maxValue);
    }
}