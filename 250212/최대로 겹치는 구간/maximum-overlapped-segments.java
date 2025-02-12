import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 선분갯수
        int[] line = new int[200]; // 선분이 겹치는 구간을 알아보는 배열
        Arrays.fill(line, 0);
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j < b; j++){
                line[j] += 1;
            }
        }
        int value = 0;
        for (int i = 0; i < line.length; i++) {
//            System.out.println(line[i]);
            if(value < line[i]){
                value = line[i];
            }
        }
        System.out.println(value);
    }
}