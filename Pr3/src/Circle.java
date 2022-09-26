public class Circle extends Shape {
    double radius;

    Circle () {}

    Circle (double radius){
        this.radius = radius;
    }

    Circle (double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }

    public String toString() {
        return "Circle{" +
                " radius = " + radius +
                " color = " + color +
                " filled = " + filled +
                '}';
    }
}
