public interface Order {
    boolean add (Item item);
    boolean delete (String name);
    int deleteAll (String name);
    int getAmountOfOrders();
    Item[] getItems ();
    int getSum ();
    int amountOfItemsByName (String name);
    String[] getUniqueNamesOfItems ();
    Item[] getSortedByDecreasingItems ();
}
