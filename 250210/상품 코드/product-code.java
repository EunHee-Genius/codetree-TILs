import java.util.*;

class Product{
    String name;
    int code;

    public Product(String name, int code){
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int code = sc.nextInt();

        Product pr1 = new Product(name, code);
        pr1.name = "codetree";
        pr1.code = 50;

        Product pr2 = new Product(name, code);

        System.out.println("product " + pr1.code + " is " + pr1.name);
        System.out.println("product " + pr2.code + " is " + pr2.name);
    }
}