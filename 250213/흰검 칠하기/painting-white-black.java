import java.util.*;

public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); // 명령 횟수
            int[] tile = new int[200001]; // 타일
            int[] visited = new int[200001];  // 방문여부

            // 시작은 100에서
            int start = 100000;

            for(int i = 0; i < n; i++) {
                int go = sc.nextInt();  // 얼마나 갈지
                String dir = sc.next(); // 어느 방향

                if(dir.equals("R")){
                    for(int j = start; j < start+go; j++){
                        tile[j] = 1;    // 검정색일땐 1로 만들어버리기
                        visited[j]++;
                        }
                    start = start+go-1;
//                    System.out.println("start : " + start);
                }
                else if(dir.equals("L")){
                    for(int j = start; j > start-go; j--){
                        tile[j] = 2;   // 하얀색일땐 2로 만들어버리기
                        visited[j]++;
                    }
                    start = start - go + 1;
//                    System.out.println("start : " + start);
                }
            }
            int white = 0;
            int black = 0;
            int gray = 0;
            for(int i = 0; i<tile.length; i++){
                if(visited[i] >= 4){
                    gray++;
                }else{
                    if(tile[i] == 1){
                        black++;
                    }else if(tile[i] == 2){
                        white++;
                    }
                }
            }
            System.out.print(white + " " + black + " " + gray);
    }
}