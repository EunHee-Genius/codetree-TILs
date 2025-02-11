import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");
        int[] result = new int[n.length];
        int cnt = 1;
        int sip = 1;
        int value = 0;
        // 2진수 배열 만들기
        for (int i = 0; i < n.length; i++) {
            result[i] = Integer.parseInt(n[i]);
        }
        for (int i = n.length - 1; i >= 0; i--) {
//            System.out.println(result[i]);
            value += result[i] * sip;
//            System.out.println("value : " + value+ " result : " + result[i] + " sip : " + sip);
            sip *= 2;
        }
        int x = value * 17;

        int c = 0;
        int[] d = new int[20];
        while(true){
            if(x < 2){
                d[c++] = x;
                break;
            }
            d[c++] = x%2;
            x/=2;
        }
        for(int i = c-1; i>=0; i--){
            System.out.print(d[i]);
        }
    }
}