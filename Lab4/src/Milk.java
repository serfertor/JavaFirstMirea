public class Milk implements Priceable{
    String date;
    int price;
    int procentage;

    public Milk(String date, int price, int procentage) {
        this.date = date;
        this.price = price;
        this.procentage = procentage;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProcentage(int procentage) {
        this.procentage = procentage;
    }

    public String getDate() {
        return date;
    }

    public int getProcentage() {
        return procentage;
    }

    public void getPrice(){
        System.out.println("Цена молока - " + price + " руб.");
    }
}
