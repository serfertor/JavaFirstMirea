import java.util.Scanner;

public class Upr_16 {
    public static void main(String[] args) {
        rec (0,0);
    }

    public static void rec (int max, int count){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n == 0){
            System.out.println(count);
        }
        if (max == 0){
            max = n;
            count ++;
            rec (max, count);
        } else if (n > max) {
            max = n;
            count = 1;
            rec (max, count);
        } else if (n < max){
            rec(max, count);
        } else if (n == max) {
            count++;
            rec (max, count);
        }
    }
}
