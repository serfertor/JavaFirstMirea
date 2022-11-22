import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        exer1();
        System.out.println(exer3());
        exer4();
        exer5();
    }

    public static void exer1 (){
        String s = "20.12 USD 01 RUB 12.00 RUB EU 16.45 EU";
        Pattern pattern = Pattern.compile("(([1-9]|[1-9][0-9]).\\d\\d ((USD)|(RUB)|(EU)))");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static boolean exer3 (){
        String s = "02/10/2003";
        Pattern pattern = Pattern.compile("((0[1-9])|([1-2][0-9])|(3[0-1]))/((0[1-9])|(1[0-2]))/((19|[2-9][0-9])[0-9][0-9])");
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            StringTokenizer st = new StringTokenizer(s, "/");
            String arr[] = new String[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = st.nextToken();
            }
            String day = arr[0];
            String month = arr[1];
            int year = Integer.parseInt(arr[2]);
            if ("31".equals(day)) {
                return Arrays.asList(new String[]{"01", "03", "05", "07", "08", "10", "12"}).contains(month);
            } else if ("02".equals(month)) {
                // Пpoвepяem фeвpaль
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            // Виcokocный гoд
                            return Integer.parseInt(day) <= 29;
                        }
                        // Нeвиcokocный гoд
                        return Integer.parseInt(day) <= 28;
                    }
                    // Виcokocный гoд
                    return Integer.parseInt(day) <= 29;
                } else {
                    // Нeвиcokocный гoд
                    return Integer.parseInt(day) <= 28;
                }
            } else {
                return true;
            }
        }
        return false;
    }
    public static void exer4(){
        String s = "serf@mail.ru okoto@@ya.com rer rer @gmail.com tertov@yandex.sud";
        Pattern pattern = Pattern.compile("(\\w+@)(\\w+\\.)([a-zA-Z]{2,4})");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static void exer5(){
        String s = "F032_Password smart_pass A007 TrySpy123";
        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])\\w{8,}");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}