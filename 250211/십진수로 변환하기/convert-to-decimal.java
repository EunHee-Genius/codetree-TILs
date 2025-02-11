import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strN = sc.next().split("");
        int[] n = new int[strN.length];
        for(int i = 0; i <strN.length; i++){
            n[i] = Integer.parseInt(strN[i]);
        }
        int result = 0;
        int x = 1;

        for(int i = strN.length-1; i >= 0; i--){
            result += n[i] * x;
            x = x*2;

        }
        System.out.println(result);
    }
}