import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList <Client> shop = new ArrayList<Client>();

    public static void main(String[] args) {
        Client cl1 = new Client("123", "George", "Ternov", "Alexeevich");
        Client cl2 = new Client("456", "Kate", "Popova", "Olegovna");
        Client cl3 = new Client("789","Andrew", "Ivanov", "Ivanovich");
        shop.add(cl1);
        shop.add(cl2);
        shop.add(cl3);
        Scanner n = new Scanner(System.in);
        String name;
        String surname;
        String dadName;
        String inn;
        while (true){
            System.out.println ("Введите имя");
            name = n.nextLine();
            try {
                name = checkText(name);
            } catch (Exception e){
                System.out.println("Имя не введено");
            }
            System.out.println ("Введите фамилию");
            surname = n.nextLine();
            try {
                surname = checkText(surname);
            } catch (Exception e){
                System.out.println("Фамилия не введено");
            }
            System.out.println ("Введите отчество");
            dadName = n.nextLine();
            try {
                dadName = checkText(dadName);
            } catch (Exception e){
                System.out.println("Отчество не введено");
            }
            Fio fio = new Fio(name, surname, dadName);
            System.out.println ("Введите ИНН");
            inn = n.nextLine();
            try {
                checkInn(inn, fio);
            } catch (Exception e){
                System.out.println(e.getMessage());
                continue;
            }
            System.out.println("Клиент найден и инн введен корректно");
        }
    }
    public static String checkText (String text) throws Exception {
        if (text.isEmpty()){
            throw new Exception("Text is empty");
        }
        return text;
    }

    public static String checkInn (String inn, Fio fio) throws Exception {
        for (Client i : shop){
            if (i.getFio().equalsing(fio)){
                if (i.getInn().equals(inn)){
                    return inn;
                } else {
                    throw new InvalidInn();
                }
            }
        }
        throw new Exception ("Фио не найдено");
    }
}