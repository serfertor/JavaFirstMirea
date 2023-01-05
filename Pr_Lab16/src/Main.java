import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        //создание интернет-заказа
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

        for (int i : orderManager.freeTableNumbers()) {
            System.out.print(i + " ");
        }

        //начало интерфейса
        String enter;
        Scanner in = new Scanner(System.in);
        ArrayList<Item> menu = new ArrayList<Item>();
        ArrayList<OrdersManager> managers = new ArrayList<OrdersManager>();
        while (true) {
            System.out.println("Что вы хотите сделать ? \n " +
                    "1 - новая позиция в меню \n" +
                    "2 - посмотреть меню \n" +
                    "3 - создание менеджера заказов \n" +
                    "4 - количество менеджеров \n" +
                    "5- использование менеджера");
            enter = in.nextLine();
            switch (enter) {
                case "1":
                    System.out.println("1 - новый напиток \n2 - новое блюдо\n3 - выход");
                    String mass[] = new String[3];
                    String enter1 = in.nextLine();
                    switch (enter1){
                        case "1":
                            System.out.println("Введите название, описание и цену");
                            enter1 = in.nextLine();
                            mass = enter1.split(" ");
                            try {
                                if (mass.length == 2) {
                                    Drink d1 = new Drink(mass[0], mass[1]);
                                    menu.add(d1);
                                    enter1 = " ";
                                } else if (mass.length == 3) {
                                    int price = Integer.parseInt(mass[2]);
                                    Drink d1 = new Drink(price, mass[0], mass[1]);
                                    menu.add(d1);
                                    enter1 = " ";
                                }
                            } catch (Exception e){
                                System.out.println(e.getMessage());
                                enter1 = " ";
                            }
                            break;
                        case "2":
                            System.out.println("Введите название, описание и цену");
                            enter1 = in.nextLine();
                            mass = enter1.split(" ");
                            try {
                                if (mass.length == 2) {
                                    Dish d1 = new Dish(mass[0], mass[1]);
                                    menu.add(d1);
                                    enter1 = " ";

                                } else if (mass.length == 3) {
                                    int price = Integer.parseInt(mass[2]);
                                    Dish d1 = new Dish(price, mass[0], mass[1]);
                                    menu.add(d1);
                                    enter1 = " ";

                                }
                            } catch (Exception e){
                                System.out.println(e.getMessage());
                                enter1 = " ";
                            }
                            break;
                        case "3":
                            enter1 = " ";
                            break;
                    }
                case "2":
                    for (Item i : menu){
                        System.out.println(i.toString());
                    }
                    break;
                case "3":
                    System.out.println("1 - с указанием количества столиков \n2 - без\n3 - выход");
                    enter1 = in.nextLine();
                    switch (enter1){
                        case "1":
                            System.out.println("Введите количество столиков");
                            enter1 = in.nextLine();
                            OrdersManager manager = new OrdersManager(Integer.parseInt(enter1));
                            managers.add(manager);
                            break;
                        case "2":
                            OrdersManager manager2 = new OrdersManager(Integer.parseInt(enter1));
                            managers.add(manager2);
                            break;
                        case "3":
                            break;
                    }
                    enter1 = " ";
                    break;
                case "4":
                    for (int i = 0; i < managers.size()+1; i++){
                        System.out.print("Менеджеры: "+ i + " ");
                    }
                    break;
                case "5":
                    System.out.println("Введите номер менеджера");
                    enter1 = in.nextLine();
                    OrdersManager thisManager = managers.get(Integer.parseInt(enter1) - 1);
                    System.out.println("1 - добавление заказа столику \n" +
                            "2 - добавление позиции столику \n" +
                            "3 - получение первого свободного столика \n" +
                            "4 - получение списка свободных столиков \n" +
                            "5 - вывод заказа по номеру столика \n" +
                            "6 - удаление заказа по номеру столика \n" +
                            "7 - добавление интернет заказа \n" +
                            "8 - добавление позиций интернет-заказа по адресу \n" +
                            "9 - удаление интернет заказа \n" +
                            "10 - общая стоимость интернет-заказов \n" +
                            "11 - количество позиций во всех интернет заказах");
                    enter1 = in.nextLine();
                    switch (enter1){
                        case "1":
                            RestaurantOrder newOrder = new RestaurantOrder();
                            System.out.println("Введите номер столика");
                            enter1 = in.nextLine();
                            try {
                                thisManager.add(newOrder, Integer.parseInt(enter1));
                                enter1 = " ";
                            } catch (Exception e){
                                System.out.println(e.getMessage());
                                enter1 = " ";
                            }
                            break;
                        case "2":
                            System.out.println("Введите номер позиции из меню");
                            int position = Integer.parseInt(in.nextLine());
                            System.out.println("Введите номер столика");
                            int number = Integer.parseInt(in.nextLine());
                            try {
                                thisManager.addItem(menu.get(position), number);
                                enter1 = " ";
                            } catch (Exception e){
                                System.out.println(e.getMessage());
                                enter1 = " ";
                            }
                            break;
                        case "3":
                            System.out.println("Номер столика " + thisManager.freeTableNumber());
                            enter1 = " ";
                            break;
                        case "4":
                            int numbers[] = thisManager.freeTableNumbers();
                            for (int i : numbers){
                                System.out.print(i + " ");
                            }
                            enter1 = " ";
                            break;
                        case "5":
                            System.out.println("Введите номер столика");
                            position = Integer.parseInt(in.nextLine());
                            try {
                                Order n = thisManager.getOrder(position);
                                System.out.println(n.getSortedByDecreasingItems());
                                enter1 = " ";
                            } catch (Exception e){
                                System.out.println(e.getMessage());
                                enter1 = " ";
                            }
                            break;
                        case "6":
                            System.out.println("Введите номер столика");
                            position = Integer.parseInt(in.nextLine());
                            try {
                                thisManager.deleteByNumberOfTable(position);
                                enter1 = " ";
                            } catch (Exception e){
                                System.out.println(e.getMessage());
                                enter1 = " ";
                            }
                            break;
                        case "7":
                            InternetOrder newOrderE = new InternetOrder();
                            System.out.println("Введите адрес");
                            enter1 = in.nextLine();
                            try {
                                thisManager.addE(enter1, newOrderE);
                                enter1 = " ";
                            } catch (Exception e){
                                System.out.println(e.getMessage());
                                enter1 = " ";
                            }
                            break;
                        case "8":
                            System.out.println("Введите номер позиции из меню");
                            position = Integer.parseInt(in.nextLine());
                            System.out.println("Введите адрес");
                            enter1 = in.nextLine();
                            try {
                                thisManager.addItemE(enter1, menu.get(position));
                                enter1 = " ";
                            } catch (Exception e){
                                System.out.println(e.getMessage());
                                enter1 = " ";
                            }
                            break;
                        case "9":
                            System.out.println("Введите адрес");
                            enter1 = in.nextLine();
                            System.out.println(thisManager.deleteE(enter1));
                            enter1 = " ";
                            break;
                        case "10":
                            System.out.println("Общая стоимость интернет-заказов - " + thisManager.costTotalE());
                            enter1 = " ";
                            break;
                        case "11":
                            System.out.println("Количество позиций интернет-заказов - " + thisManager.getDishE());
                            enter1 = " ";
                            break;
                    }
                    break;
            }
        }
    }
}
