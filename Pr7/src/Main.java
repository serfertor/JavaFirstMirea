import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack <Integer> firstPlayer = new Stack<Integer>();
        Stack <Integer> secondPlayer = new Stack<Integer>();
        Stack <Integer> mem = new Stack<Integer>();
        Scanner in = new Scanner(System.in);
        int k;
        for (int i = 0; i < 5; i++){
            k = in.nextInt();
            mem.push(k);
        }
        for (int i = 0; i < 5; i++){
            k = mem.pop();
            firstPlayer.push(k);
        }
        for (int i = 0; i < 5; i++){
            k = in.nextInt();
            mem.push(k);
        }
        for (int i = 0; i < 5; i++){
            k = mem.pop();
            secondPlayer.push(k);
        }
        k = 0;
        while ((!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) && (k < 106)) {
            k++;
            //System.out.println(k);
            int k1,k2;
            k1 = firstPlayer.pop();
            k2 = secondPlayer.pop();
            if (k1 > k2 && k2 != 0){
                while (!firstPlayer.isEmpty()) {
                    mem.push(firstPlayer.pop());
                }
                mem.push(k1);
                mem.push(k2);
                while (!mem.isEmpty()) {
                    firstPlayer.push(mem.pop());
                }
            } else {
                while (!secondPlayer.isEmpty()) {
                    mem.push(secondPlayer.pop());
                }
                mem.push(k1);
                mem.push(k2);
                while (!mem.isEmpty()) {
                    secondPlayer.push(mem.pop());
                }
            }
        }
        if (k == 106){
            System.out.println("botva");
        } else if (firstPlayer.isEmpty()) {
            System.out.println("second " + k);
        } else {
            System.out.println("first " + k);
        }
    }
}