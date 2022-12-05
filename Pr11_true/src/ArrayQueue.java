public class ArrayQueue <E>{
    private E[] array;
    private int amount;
    ArrayQueue (int size){
        this.amount = 0;
        this.array = (E[])new Object[size];
    }
    public void enqueue (E elem){
        if (amount >= array.length) {
            E[] newArray = (E[]) new Object[array.length + 7];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[amount] = elem;
        amount++;
    }
    public E element(){
        if (!isEmpty()) {
            return array[0];
        } else {
            return null;
        }
    }
    public E dequeue() {
        if (!isEmpty()){
            E firstElem = array[0];
            for (int i = 0; i < array.length-1;i++){
                array[i] = array[i+1];
            }
            amount--;
            return firstElem;
        } else {
            return null;
        }
    }
    public boolean isEmpty(){
        return amount>0 ? false : true;
    }
    public int size(){
        return amount;
    }
    public void clear(){
        amount = 0;
    }
}
