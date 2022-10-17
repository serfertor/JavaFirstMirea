public class Main { //Вариант 1
    public static void main(String[] args) {
        int [] k = {1, 9, 6, 4, 5};
        int sum = 0;
        for (int i = 0; i < k.length; i++) {
            sum+=k[i];
        }
        System.out.println(sum);
        sum = 0;
        int i = 0;
        while (i<k.length){
            sum+=k[i];
            i++;
        }
        System.out.println(sum);
        sum = 0;
        i = 0;
        do {
            sum+=k[i];
            i++;
        } while (i < k.length);
        System.out.println(sum);
    }
}