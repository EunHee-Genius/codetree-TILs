import java.util.*;

class User{
    String id;
    int level;

    public User(){
        this.id = "";
        this.level = 0;
    }

    public User(String id, int level){
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    User user = new User();
    user.id = "codetree";
    user.level = 10;

    String id = sc.next();
    int level = sc.nextInt();

    User user2 = new User(id, level);

    System.out.println("user " + user.id + " lv " + user.level);
    System.out.println("user " + user2.id + " lv " + user2.level);
    }
}