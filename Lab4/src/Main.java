public class Main {
    public static void main(String[] args) {
        Priceable obj1 = new Bread ("10.10.2022", 70, "white");
        obj1.getPrice();
        obj1 = new Milk("17.10.2022", 90, 4);
        obj1.getPrice();
        obj1 = new Cheese ("18.10.2022", 100, false);
        obj1.getPrice();
    }
}