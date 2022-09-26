public class Rectangle extends Shape{
    double width;
    double length;

    Rectangle (){}

    Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }

    Rectangle (double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return 0.5 * width * length;
    }

    public double getPerimeter() {
        return width + length + Math.sqrt(width * width + length * length);
    }

    public String toString() {
        return "Rectangle{" +
                " width = " + width +
                " length = " + length +
                " color = " + color +
                " filled = " + filled +
                '}';
    }
}
