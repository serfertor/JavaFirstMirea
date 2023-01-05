public final class Dish implements Item{
    private int price;
    private String name;
    private String description;

    public Dish(String name, String description) throws IllegalArgumentException {
        if (name.isEmpty() && description.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.description = description;
        this.price = 0;
    }
    public Dish(int price, String name, String description) {
        if (name.isEmpty() && description.isEmpty() && price < 0){
            throw new IllegalArgumentException();
        }
        this.price = price;
        this.name = name;
        this.description = description;
    }
    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
