import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()) {
                case "push_back":
                list.add(Integer.parseInt(st.nextToken()));
                break;
                case "pop_back":
                list.remove(list.size()-1);
                break;
                case "size":
                System.out.println(list.size());
                break;
                case "get":
                System.out.println(list.get(Integer.parseInt(st.nextToken())-1));
                break;
            }
        }
    }
}