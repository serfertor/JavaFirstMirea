import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WaitList<Object> lst1 = new BoundedWaitList<>(5);
        lst1.add(1);
        lst1.add(2);
        lst1.add("ter");
        lst1.add(4);
        System.out.println(lst1.content);

        WaitList<Integer> lst2 = new BoundedWaitList<>(3);
        lst2.add(1);
        lst2.add(2);
        lst2.add(3);
        lst2.add(4);
        lst2.add(5);
        System.out.println(lst2.content); //неправильный входные данные

        WaitList<Integer> lst3 = new UnfairWaitList<>();
        lst3.add(1);
        lst3.add(2);
        lst3.add(3);
        System.out.println(lst3.content);
        lst3.content.remove(2);
        lst3.content.remove(3);
        System.out.println(lst3.content);

        WaitList<Integer> lst4 = new WaitList<Integer>();
        lst4.content.add(1);
        lst4.content.add(2);
        lst4.content.add(3);
        lst4.content.add(4);
        lst4.content.add(5);
        System.out.println(lst4.content);
        lst4.content.remove(5);
        System.out.println(lst4.content);
        System.out.println(lst4.content.contains(4));

        List<Integer> lst5 = new ArrayList<Integer>();
        lst5.add(1);
        lst5.add(2);
        lst5.add(3);
        lst5.add(4);
        System.out.println(lst4.content.containsAll(lst5));
        System.out.println(lst4.content.isEmpty());
    }
}
