import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] sstr = str.toCharArray();
        Arrays.sort(sstr);
        String ssstr = new String(sstr);
        System.out.println(ssstr);
    }
}