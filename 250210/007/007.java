import java.util.*;

class Meeting {
    String code;
    char place;
    int time;

    public Meeting(String code, char place, int time){
        this.code = code;
        this.place = place;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        char place = sc.next().charAt(0);
        int time = sc.nextInt();

        Meeting meet = new Meeting(code, place, time);

        System.out.println("secret code : " + meet.code);
        System.out.println("meeting point : " + meet.place);
        System.out.println("time : " + meet.time);
    }
}