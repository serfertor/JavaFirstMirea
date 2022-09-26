import java.util.Scanner;

public class Upr_17 {
    public static void main(String[] args) {
        rec(0);
    }

    public static void rec (int max){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n == 0){
            System.out.println(max);
        }
        if (max == 0){
            max = n;
            rec (max);
        } else if (max < n) {
            max = n;
            rec(max);
        } else {
            rec(max);
        }
    }
}
