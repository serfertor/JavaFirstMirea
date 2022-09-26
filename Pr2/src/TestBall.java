public class TestBall {
    public static void main(String[] args) {
        Ball a1 = new Ball(10, 10);
        System.out.println(a1);
        a1.move(15,20);
        a1.move(25,15);
        System.out.println(a1);
    }
}
