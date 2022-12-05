import java.util.ArrayList;

public class ArrayQueue <E>{
    private E[] array;
    private int amount;

    ArrayQueue (int size){
        this.amount = 0;
        this.array = (E[])new Object[size];
    }

    public void enqueue (E elem){
        if (amount >= array.length) {
            E[] newArray = (E[]) new Object[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[amount] = elem;
        amount++;
    }
}
