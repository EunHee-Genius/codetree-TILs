import java.util.*;

class User{
    String name, address, city;

    public User(String name, String address, String city){
        this.name = name;
        this.address = address;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        User[] user = new User[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            String address = sc.next();
            String city = sc.next();

            user[i] = new User(name, address, city);
        }
        int min = 0;
        for(int i = 1; i < n; i++){
            if(user[i].name.compareTo(user[min].name) > 0){
                min = i;
            }
        }
        System.out.println("name "+user[min].name);
        System.out.println("addr "+user[min].address);
        System.out.println("city "+user[min].city);
    }
}