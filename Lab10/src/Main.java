import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer arr1[] = new Integer[2];
        arr1[0] = 1;
        arr1[1] = 2;
        String arr2[] = new String[2];
        arr2[0] = "First";
        arr2[1] = "Second";
        System.out.println(getByIndex(arr1, 0));
        System.out.println(getByIndex(arr2, 1));
        ArrayList <Integer> newArr = convertArrayToList(arr1);
        System.out.println(newArr);
    }
    public static <E> E getByIndex (E[] a, int j){
        return a[j];
    }

    public static <E> ArrayList convertArrayToList (E[] a){
        ArrayList<E>newArr = new ArrayList<>(a.length);
        for (int i = 0; i < a.length; i++){
            newArr.add(i, a[i]);
        }
        return newArr;
    }
}