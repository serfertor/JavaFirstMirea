public class ArrayQueueModule {
    private Object[] array;
    private int amount;
    ArrayQueueModule (int size){ //�����������
        this.amount = 0;
        this.array = new Object[size];
    }
    public void enqueue (Object elem){ //���������� ��������
        if (amount >= array.length) {
            Object[] newArray = new Object[array.length + 7];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[amount] = elem;
        amount++;
    }
    public Object element(){ //������� ������� �������� �������
        if (!isEmpty()) {
            return array[0];
        } else {
            return null;
        }
    }
    public Object dequeue() { //������� � �������� ������� �������� �������
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
    public boolean isEmpty(){ //������ �� �������
        return amount>0 ? false : true;
    }
     public int size(){ //������� ������ �������
        return amount;
     }
     public void clear(){ //�������� ����� ����������� "���������" �� ������� � ������
        amount = 0;
     }
}