import java.util.*;

class User{
    String id;
    int level;

    public User(){
        this.id = "";
        this.level = 0;
    }
    }

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    User user = new User();
    user.id = "codetree";
    user.level = 10;

    System.out.println("user " + user.id + " lv " + user.level);

    user.id = sc.next();
    user.level = sc.nextInt();
    System.out.println("user " + user.id + " lv " + user.level);
    }
}