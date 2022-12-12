public class Main {
    public static void main(String[] args) {
        //заказ в ресторане
        Order order1 = new RestaurantOrder();
        try {
            order1.add(new Dish(100, "Cтейк", "Говядина"));
            order1.add(new Drink(20, "Чай", "Черный"));
            order1.add(new Dish(60, "Плов", "С курицей"));
            order1.add(new Drink(30, "Морс", "Клюквенный"));
            order1.add(new Dish(60, "Плов", "С курицей"));
        } catch (IllegalArgumentException e) {
            System.out.println("Неправильный ввод блюда/напитка");
        }
        System.out.println(order1.getSum());
        System.out.println(order1.amountOfItemsByName("Плов"));
        System.out.println(order1.delete("Плов"));
        System.out.println(order1.getAmountOfOrders());
        for (String s: order1.getUniqueNamesOfItems())
            System.out.println(s);
        order1.add(new Dish(60, "Плов", "С курицей"));
        System.out.println(order1.deleteAll("Плов"));
        for (Item item : order1.getSortedByDecreasingItems())
            System.out.println(item.getName());

        //????????-?????
        Order order2 = new InternetOrder();
        try {
            order2.add(new Dish(100, "Cтейк", "Говядина"));
            order2.add(new Drink(20, "Чай", "Черный"));
            order2.add(new Dish(60, "Плов", "С курицей"));
            order2.add(new Drink(30, "Морс", "Клюквенный"));
            order2.add(new Dish(60, "Плов", "С курицей"));
        } catch (IllegalArgumentException e) {
            System.out.println("Неправильный ввод блюда/напитка");
        }
        //проверка менеджера
        OrdersManager orderManager = new OrdersManager();
        try {
            orderManager.addE("Юго-западная 1", order2);
            //orderManager.add(order1, 12);   //ошибка номера столика
            orderManager.add(order1, 3);
            //orderManager.add("Юго-западная 1", order2);   //ошибка адреса
        } catch (OrderAlreadyAddedException e) {
            System.out.println("Order have been already exist");
        } catch (IllegalTableNumber e) {
            System.out.println("Wrong number of table");;
        }

        System.out.println(orderManager.costTotalE());

        for (int i : orderManager.freeTableNumbers())
            System.out.print(i + " ");
    }
}
