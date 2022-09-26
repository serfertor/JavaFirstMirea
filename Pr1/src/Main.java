public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Ball class:");
        Ball d1 = new Ball("Red", "basketball", 10);
        Ball d2 = new Ball("Blue", "volleyball", 12);
        Ball d3 = new Ball ("Purple", "golf");
        d3.setRadius(4);
        d2.dropBall();
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println("\nTesting Book class:");
        Book k1 = new Book ("Science", "Programming","Smirnov", 300);
        Book k2 = new Book ("Fantastic", "Its hard to be the God", "Strugatsky brothers", 350);
        Book k3 = new Book ("Romance", "Crime and Punishment", "Dostoevsky");
        k3.setAmountPages(600);
        System.out.println(k1.toString());
        k2.readingTime();
        System.out.println(k3.toString());
    }
}