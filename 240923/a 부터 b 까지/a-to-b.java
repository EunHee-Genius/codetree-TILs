import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a;

        for(int i = a; result <= b; i++){
            System.out.print(result + " ");
            if(i%2!=0){
                result *= 2;
            } else {
                result += 3;
            }
        }
    }
}