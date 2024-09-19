import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        for(int i = score; i <= 100; i++){
            if(score >= 90){
                System.out.print("A ");
                score++;
            }else if(score >= 80){
                System.out.print("B ");
                score++;
            }else if(score >= 70){
                System.out.print("C ");
                score++;
            }else if(score >= 60){
                System.out.print("D ");
                score++;
            }else {
                System.out.print("F ");
            }
        }
    }
}