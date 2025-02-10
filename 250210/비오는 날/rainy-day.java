import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Result> results = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String text = sc.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = dateFormat.parse(text);  // 문자열을 Date로 변환
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please use 'yyyy-MM-dd'.");
                continue;  // 예외 발생 시 해당 입력을 건너뜁니다
            }

            String dayOfWeek = sc.next();
            String weather = sc.next();

            results.add(new Result(date, dayOfWeek, weather));
        }

        results.sort(Comparator.comparing(result -> result.date));
        for(Result result : results) {
            if(result.weather.equals("Rain")){
                System.out.println(result);
                break;
            }
        }
    }
}

class Result {

    Date date;
    String dayOfWeek;
    String weather;

    Result(Date date, String dayOfWeek, String weather) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        this.weather = weather;
    }

    @Override
    public String toString() {
        // Date 형식을 지정하여 출력
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        return String.format("%s %s %s", outputFormat.format(date), dayOfWeek, weather);
    }
}