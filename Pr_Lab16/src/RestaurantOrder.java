public class RestaurantOrder implements Order{
    private int size = 0; //������ �������
    private int amount = 0; //���������� �������
    private Item[] items;

    public RestaurantOrder() {
        items = new Item[0];
    }

    private void expansion() { //����� ���������� �������
        Item[] temp = new Item[items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        items = temp;
        size++;
    }

    private void deleteElementByIndex(int index) {//����� �������� �������� �� �������
        Item[] temp = new Item[items.length - 1];
        System.arraycopy(items, 0, temp, 0, index);
        System.arraycopy(items, index + 1, temp, index, items.length - index - 1);
        items = temp;
        size--;
    }

    public boolean add(Item item) { //���������� ������ ��������
        expansion();
        items[size - 1] = item;
        amount++;
        return true;
    }

    public boolean delete(String name) { //�������� �������� �� �����
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(name)) {
                deleteElementByIndex(i);
                return true;
            }
        }
        return false;
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

    public Item[] getItems() { //������ �������
        return items;
    }

    public int getSum() { //����� ��������� �������
        int sum = 0;
        for (Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public int amountOfItemsByName(String name) { //���������� ���� ��� �������� � �������� ���������
        int i = 0;
        for (Item item : items){
            if(item.getName().equals(name)){
                i++;
            }
        }
        return i;
    }

    public String[] getUniqueNamesOfItems() { //������� ������ ���������� ���� ���� � ��������
        String[] strings = new String[0];
        for (int i = 0; i < size; i++) {
            boolean isFound = false;
            for (String menuItem : strings) {
                if (menuItem != null && menuItem.equals(items[i].getName())) {
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                String[] temp = new String[strings.length + 1];
                System.arraycopy(strings, 0, temp, 0, strings.length);
                temp[temp.length - 1] = items[i].getName();
                strings = temp;
            }
        }
        return strings;
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
