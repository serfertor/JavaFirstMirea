public class Main {
    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        int k = obj.getKey();
        if (k == 0){
            System.out.println("Успешный ввод");
        } else {
            System.out.println("Превышено количество попыток");
        }
    }
}
