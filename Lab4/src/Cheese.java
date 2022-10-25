public class Cheese implements Priceable{
    String date;
    int price;
    boolean withAdditionals;

    public Cheese(String date, int price, boolean withAdditionals) {
        this.date = date;
        this.price = price;
        this.withAdditionals = withAdditionals;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProcentage(boolean withAdditionals) {
        this.withAdditionals = withAdditionals;
    }

    public String getDate() {
        return date;
    }

    public boolean getWithAdditionals() {
        return withAdditionals;
    }

    public void getPrice(){
        System.out.println("Цена сыра - " + price + " руб.");
    }
}