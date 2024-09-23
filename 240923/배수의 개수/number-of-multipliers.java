import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int three = 0;
        int five = 0;
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if (arr[i]%3 ==0){
                three++;
            } else if(arr[i]%5 == 0){
                five++;
            }
        }System.out.print(three + " " + five);
    
    }
}