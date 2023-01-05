import java.util.HashMap;

public class OrdersManager {
    private Order[] orders; //заказы в ресторане
    private HashMap<String, Order> ordersE; //интернет-заказы <адрес, заказ>

    public OrdersManager() { //конструктор по умолчанию
        orders = new Order[10];
        ordersE = new HashMap<>();

    }

    public OrdersManager(int tableCount) { //конструктор с заданным значением количества столиков
        orders = new Order[tableCount];
        ordersE = new HashMap<>();
    }

    private void removeElementByIndex(int index) { //удаления элемента по индексу
        Order[] temp = new Order[orders.length - 1];
        System.arraycopy(orders, 0, temp, 0, index);
        System.arraycopy(orders, index + 1, temp, index, orders.length - index - 1);
        orders = temp;
    }
    /*методы для столиков*/
    public void add(Order order, int tableNumber) throws OrderAlreadyAddedException, IllegalTableNumber { //добавления заказа к столику
        if (orders[tableNumber] != null){
            throw new OrderAlreadyAddedException();
        }
        if (tableNumber > orders.length - 1){
            throw new IllegalTableNumber();
        }
        orders[tableNumber] = order;
    }

    public void addItem(Item item, int tableNumber) throws IllegalTableNumber { //добавления позиции к заказу к столику
        if (tableNumber > orders.length - 1){
            throw new IllegalTableNumber();
        }
        orders[tableNumber].add(item);
    }

    public int freeTableNumber() { //получения свободного столика
        for (int i = 0; i < orders.length; i++)
            if (orders[i] == null){
                return i;
            }
        return 0;
    }

    public int[] freeTableNumbers() { //получения количества свободных столиков
        int[] numbers = new int[0];
        for (int i = 0; i < orders.length; i++) { //цикл по столикам
            if (orders[i] == null) { //проверка на отсутствие заказа
                int[] temp = new int[numbers.length + 1];
                System.arraycopy(numbers, 0, temp, 0, numbers.length);
                temp[temp.length - 1] = i;
                numbers = temp;
            }
        }
        return numbers;
    }

    public Order getOrder(int tableNumber) throws IllegalTableNumber { //получения заказа по номеру столика
        if (tableNumber > orders.length - 1){
            throw new IllegalTableNumber();
        }
        return orders[tableNumber];
    }

    public void deleteByNumberOfTable(int tableNumber) throws IllegalTableNumber { //удаления заказа по номеру столика
        if (tableNumber > orders.length - 1){
            throw new IllegalTableNumber();
        }
        removeElementByIndex(tableNumber);
    }

    public boolean deleteByOrder (Order order) { //удаления заказа
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].equals(order)) {
                removeElementByIndex(i);
                return true;
            }
        }
        return false;
    }

    public int removeAll(Order order) { //удаления одинаковых заказов
        int count = 0;
        while (deleteByOrder(order)) {
            count++;
        }
        return count;
    }

    /*методы для интернет адресов*/
    public void addE(String address, Order order) throws OrderAlreadyAddedException { //добавления заказа по адресу
        if (ordersE.get(address) != null){
            throw new OrderAlreadyAddedException();
        }
        ordersE.put(address, order);
    }

    public Order getOrderE(String address) { //получения заказа по адресу
        return ordersE.get(address);
    }

    public boolean deleteE(String address) { //удалению заказа по адресу
        return ordersE.remove(address) != null;
    }

    public void addItemE(String address, Item item) throws OrderAlreadyAddedException { //добавление позиции к заказу
        if (ordersE.get(address) == null){
            throw new OrderAlreadyAddedException();
        }
        ordersE.get(address).add(item);
    }

    public Order[] getOrdersE() {  //получениe массива заказов
        Order[] orders = new Order[ordersE.size()];
        int i = 0;
        for (Order order : ordersE.values()) {
            orders[i++] = order;
        }
        return orders;
    }

    public double costTotalE() { //получения общей стоимости
        double cost = 0;
        for (Order order : ordersE.values()) {
            cost += order.getSum(); //добавление стоимости заказа
        }
        return cost;
    }

    public int getDishE() { //получения количества позиций во всех заказах
        int i = 0;
        for (Order order : ordersE.values()) {
            i += order.getAmountOfOrders();
        }
        return i;
    }
}