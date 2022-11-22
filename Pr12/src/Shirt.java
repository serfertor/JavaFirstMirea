public class Shirt {
    private String number;
    private String type;
    private String colour;
    private String size;

    public Shirt (String a){
        String mass[]= new String[4];
        mass = a.split(",");
        this.number = mass[0];
        this.type = mass[1];
        this.colour = mass[2];
        this.size = mass[3];
    }

    @Override
    public String toString() {
        return "Артикул: " + number + '\n' +
                "Тип вещи: " + type + '\n' +
                "Цвет: " + colour + '\n' +
                "Размер: " + size + '\n';
    }
}
