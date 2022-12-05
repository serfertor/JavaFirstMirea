public class InternetOrder implements Order{
    private static class Node { //����� ��������� ����������� ������
        Item data;
        Node next;
        Node prev;
        public Node(){
            this.data = null;
            this.next = null;
            this.prev = null;
        }
        public Node(Item data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head = null;
    private Node tail = null;
    private int amount = 0;

    public InternetOrder(){
        head = new Node();
        tail = new Node();
        head.next = tail;
        head.prev = tail;
        tail.prev = head;
        tail.next = head;

    }

    public InternetOrder (Item[] items){
        if (items.length == 0){
            return;
        }
        for (Item item : items) {
            add(item);
        }
        amount = items.length;
    }

    public boolean add(Item item) {   //���������� ������ ��������
        if (head.data == null) {      //�������� �� ���������� ��������� �������
            head.data = item;
            amount++;
            return true;
        }
        if (tail.data == null) {     //�������� �� ���������� ������
            tail.data = item;
            amount++;
            return true;
        }
        tail.next = new Node(item);  //����� ������
        tail.next.prev = tail;
        tail.next.next = head;
        tail = tail.next;
        head.prev = tail;
        amount++;
        return true;
    }

    public boolean delete(String name) { //�������� �������� �� �����
        Node q = head; //���������� ������
        for (int i = 0; i < amount; i++){ //������ �� ������������ ������ ���� ���
            if (q.data.getName().equals(name)){
                if (amount == 1){ //������ ������� �� ������ ��������
                    head = null;
                    tail = null;
                    amount--;
                    return true;
                }
                if (q == head){  //�������� ������
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                    amount--;
                    return true;
                }
                if (q == tail){ //�������� ������
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                    amount--;
                    return true;
                } else {        //����� ������
                    q.prev.next = q.next;
                    q.next.prev = q.prev;
                    amount--;
                    return true;
                }
            }
            q = q.next;
        }
        return false; //���� ������� ������� �� ������ ��� ������ ������
    }

    public int deleteAll(String name) { //�������� ���� ��������� � ������ ������
        int i = 0;
        while (delete(name)){
            i++;
        }
        return i;
    }

    public int getAmountOfOrders() { //���������� �������
        return amount;
    }

    public Item[] getItems() {  //������ �������
        int counter = 0;
        Item[] items = new Item[0];
        Node q = head;
        for (int i = 0; i < amount; i++){
            if (q.data != null){
                if (counter>items.length){
                    Item[] temp = new Item[items.length+1];
                    System.arraycopy(items,0,temp,0,items.length);
                    items = temp;
                }
                items[counter] = q.data;
                counter++;
            }
            q = q.next;
        }
        return items;
    }

    public int getSum() {  //����� ��������� �������
        Node q = head;
        int sum = 0;
        for (int i = 0; i < amount; i++){
            if (q.data != null){
                sum+=q.data.getPrice();
            }
            q = q.next;
        }
        return sum;
    }

    public int amountOfItemsByName(String name) { //���������� ���� ��� �������� � �������� ���������
        int counter = 0;
        Node q = head;
        for (int i = 0; i < amount; i++){
            if (q.data.getName().equals(name)){
                counter++;
            }
            q = q.next;
        }
        return counter;
    }

    public String[] getUniqueNamesOfItems() { //������� ������ ���������� ���� ���� � ��������
        String[] items = new String[0];
        Node q = head;
        for (int i = 0; i < amount; i++){
            boolean isFound = false;
            for (String t : items) {
                if (t.equals(q.data)) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                String[] temp = new String[items.length + 1];
                System.arraycopy(items, 0, temp, 0, items.length);
                temp[temp.length - 1] = q.data.getName();
                items = temp;
            }
            q = q.next;
        }
        return items;
    }

    public Item[] getSortedByDecreasingItems() { //������ �������� ���� � �������� ��������������� �� �������� �� ����
        Item[] items = getItems(); //������ �������
        for (int i = 0; i < items.length; i++) { //���������� ���������
            Item st = items[i];
            int j = i - 1;
            for (; (j >= 0) && (st.getPrice() - items[j].getPrice() < 0); j--)
                items[j + 1] = items[j];
            items[j + 1] = st;
        }
        return items; //������� �������
    }
}
