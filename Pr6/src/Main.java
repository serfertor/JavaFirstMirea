import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("Введите количество студентов");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int sum;
        String name;
        Student[] ar = new Student[n];
        for (int i = 0; i < n; i++){
            sum = in.nextInt();
            name = in.nextLine();
            Student q = new Student(sum, name);
            ar[i] = q;
        }
        SortingMerge.sorts(ar, 0, ar.length-1);

    }
}