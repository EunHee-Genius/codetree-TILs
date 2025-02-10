import java.util.*;

class User{
    char codeName;
    int score;

    public User(){
        this.codeName = 'a';
        this.score = 0;
    }

    public User(char codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        User[] user = new User[n];
        for(int i = 0; i < n; i++){
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();

            user[i] = new User(codeName, score);
        }

        int value = 0;
        for(int i = 1; i < n; i++){
            if(user[value].score > user[i].score){
                value = i;
            }
        }
     System.out.println(user[value].codeName + " " + user[value].score);
    }
}