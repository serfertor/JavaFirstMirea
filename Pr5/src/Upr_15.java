import java.util.Scanner;

public class Upr_15 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        rec(n);
    }
    public static int rec (int n){
        if (n >= 10) {
            System.out.print(n % 10 + " ");
            return rec(n / 10);
        } else {
            System.out.print(n);
            return n;
        }
    }
}
