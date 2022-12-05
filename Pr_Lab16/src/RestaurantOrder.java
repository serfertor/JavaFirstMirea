public class RestaurantOrder implements Order{
    private int size = 0; //размер массива
    private int amount = 0; //количество заказов
    private Item[] items;

    public RestaurantOrder() {
        items = new Item[0];
    }

    private void expansion() { //метод расширения массива
        Item[] temp = new Item[items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        items = temp;
        size++;
    }

    private void deleteElementByIndex(int index) {//метод удаления элемента по индексу
        Item[] temp = new Item[items.length - 1];
        System.arraycopy(items, 0, temp, 0, index);
        System.arraycopy(items, index + 1, temp, index, items.length - index - 1);
        items = temp;
        size--;
    }

    public boolean add(Item item) { //добавление нового элемента
        expansion();
        items[size - 1] = item;
        amount++;
        return true;
    }

    public boolean delete(String name) { //удаление элемента по имени
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(name)) {
                deleteElementByIndex(i);
                return true;
            }
        }
        return false;
    }

    public int deleteAll(String name) { //удаление всех элементов с данным именем
        int i = 0;
        while (delete(name)){
            i++;
        }
        return i;
    }

    public int getAmountOfOrders() { //количество заказов
        return amount;
    }

    public Item[] getItems() { //массив заказов
        return items;
    }

    public int getSum() { //общая стоимость заказов
        int sum = 0;
        for (Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public int amountOfItemsByName(String name) { //количество блюд или напитков с заданным названием
        int i = 0;
        for (Item item : items){
            if(item.getName().equals(name)){
                i++;
            }
        }
        return i;
    }

    public String[] getUniqueNamesOfItems() { //возврат списка уникальных имен блюд и напитков
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

    public Item[] getSortedByDecreasingItems() { //список названий блюд и напитков отсортированных по убыванию по цене
        Item[] items = getItems(); //массив позиций
        for (int i = 0; i < items.length; i++) { //сортировка вставками
            Item st = items[i];
            int j = i - 1;
            for (; (j >= 0) && (st.getPrice() - items[j].getPrice() < 0); j--)
                items[j + 1] = items[j];
            items[j + 1] = st;
        }
        return items; //возврат массива
    }
}
