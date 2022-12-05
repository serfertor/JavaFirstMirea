public class ArrayQueueModule {
    private Object[] array;
    private int amount;
    ArrayQueueModule (int size){ //конструктор
        this.amount = 0;
        this.array = new Object[size];
    }
    public void enqueue (Object elem){ //добавление элемента
        if (amount >= array.length) {
            Object[] newArray = new Object[array.length + 7];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[amount] = elem;
        amount++;
    }
    public Object element(){ //возврат первого элемента очереди
        if (!isEmpty()) {
            return array[0];
        } else {
            return null;
        }
    }
    public Object dequeue() { //возврат и удаление первого элемента очереди
        if (!isEmpty()){
            Object firstElem = array[0];
            for (int i = 0; i < array.length-1;i++){
                array[i] = array[i+1];
            }
            amount--;
            return firstElem;
        } else {
            return null;
        }
    }
    public boolean isEmpty(){ //пустая ли очередь
        return amount>0 ? false : true;
    }
     public int size(){ //текущий размер очереди
        return amount;
     }
     public void clear(){ //удаление путем перемещения "указателя" на вставку в начало
        amount = 0;
     }
}