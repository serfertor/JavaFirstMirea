public class ArrayQueueADT {
    private Object[] array;
    private int amount;
    ArrayQueueADT (int size){
        this.amount = 0;
        this.array = new Object[size];
    }
    public static void enqueue (Object elem, ArrayQueueADT in){
        if (in.amount >= in.array.length) {
            Object[] newArray = new Object[in.array.length + 7];
            System.arraycopy(in.array, 0, newArray, 0, in.array.length);
            in.array = newArray;
        }
        in.array[in.amount] = elem;
        in.amount++;
    }
    public static Object element(ArrayQueueADT in){
        if (!isEmpty(in)) {
            return in.array[0];
        } else {
            return null;
        }
    }
    public static Object dequeue(ArrayQueueADT in) {
        if (!isEmpty(in)){
            Object firstElem = in.array[0];
            for (int i = 0; i < in.array.length-1;i++){
                in.array[i] = in.array[i+1];
            }
            in.amount--;
            return firstElem;
        } else {
            return null;
        }
    }
    public static boolean isEmpty(ArrayQueueADT in){
        return in.amount>0 ? false : true;
    }
    public static int size(ArrayQueueADT in){
        return in.amount;
    }
    public static void clear(ArrayQueueADT in){
        in.amount = 0;
    }
}
