public class Square extends Rectangle{
    Square (){}

    Square (double side){
        this.length = side;
        this.width = side;
    }

    Square (double side, String color, boolean filled){
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public String toString() {
        return "Square{" +
                " width = " + width +
                " length = " + length +
                " color = " + color +
                " filled = " + filled +
                '}';
    }
}
