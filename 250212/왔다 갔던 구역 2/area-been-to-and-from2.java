import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 명령 횟수
        int[] line = new int[200];  // 이동칸 배열
        Arrays.fill(line, 0);

        int now = 100;
        for(int i = 0; i < n; i++){
//            line[start] += 1;
            int go = sc.nextInt();
            String dir = sc.next();
            if(dir.equals("R")){
//                System.out.println("11111111111111111");
                int right = now + go;
                for(int j = now; j < right; j++){
                    line[j] += 1;
                    now++;
//                    System.out.println(now + " " + go);
                }
            }
            else if(dir.equals("L")){
//                int go = 100 - sc.nextInt();
                int left = now - go;
                for(int j = now; j >= left; j--){
                    line[j] += 1;
                    now--;
//                    System.out.println(now + " " + go);
                }
            }
        }
       int cnt = 0;
        for(int i = 0; i < line.length; i++){
            if(line[i] >= 2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}