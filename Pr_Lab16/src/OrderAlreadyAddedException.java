public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException() {
        super("Заказ уже создан");
    }
}