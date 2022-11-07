import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<String>();
        names.add("Max");
        names.add ("Emma");
        names.add("Kate");
        System.out.println("First el - " + names.get(0));
        System.out.println("Index of Emma" + names.indexOf("Emma"));
        names.remove(0);
        names.set (1,"Oleg");
        ArrayList <String> addnames = new ArrayList<String>();
        addnames.add("George");
        addnames.add("Mary");
        names.addAll(addnames);
        for (String i : names){
            System.out.println(i);
        }
        ArrayList <Object> ter = new ArrayList<Object>();
        String q = "ter";
        ter.add(q);
        System.out.println(ter.get(0));
        names.isEmpty();
    }
}