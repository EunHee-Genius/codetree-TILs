import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 명령 횟수
        int[] tile = new int[300001]; // 타일
        int[] whiteVisited = new int[300001];  // 흰색 방문 여부
        int[] blackVisited = new int[300001];  // 검정 방문 여부

        // 시작은 100000
        int start = 150000;

        for(int i = 0; i < n; i++) {
            int go = sc.nextInt();  // 얼마나 갈지
            String dir = sc.next(); // 어느 방향

            if(dir.equals("R")){
                for(int j = start; j < start+go; j++){
                    tile[j] = 1;    // 검정색일땐 1로 만들어버리기
                    blackVisited[j]++;
                }
                start = start+go-1;
            }
            else if(dir.equals("L")){
                for(int j = start; j > start-go; j--){
                    tile[j] = 2;   // 하얀색일땐 2로 만들어버리기
                    whiteVisited[j]++;
                }
                start = start - go + 1;
            }
        }
        int white = 0;
        int black = 0;
        int gray = 0;
        for(int i = 0; i<tile.length; i++){
            if(blackVisited[i] >=2 && whiteVisited[i] >= 2){
                gray++;
            }else if(tile[i] == 1){
                    black++;
                }else if(tile[i] == 2){
                    white++;
                }
            }
        System.out.print(white + " " + black + " " + gray);
    }
}