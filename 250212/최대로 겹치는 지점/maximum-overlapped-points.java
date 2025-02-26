import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 선분 갯수
        int[] line = new int[200];
        Arrays.fill(line, 0);

        for(int i = 0; i < n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int j = start; j <= end; j++){
                line[j] += 1;
            }
        }

        int value = 0;
        for(int k = 0; k < line.length; k++){
            if(value < line[k]){
                value = line[k];
            }
        }
        System.out.println(value);
    }
}