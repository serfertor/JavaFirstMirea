public class Bread implements Priceable{
    String date;
    int price;
    String type;

    public Bread(String date, int price, String type) {
        this.date = date;
        this.price = price;
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public void getPrice(){
        System.out.println("Цена хлеба - " + price + " руб.");
    }
}
