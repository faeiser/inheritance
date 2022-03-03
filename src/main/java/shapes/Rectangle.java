package shapes;

public class Rectangle extends Shape {
    double width, length;

    public Rectangle(String color, boolean isFilled, double width, double length) throws IllegalArgumentException {
        super(color, isFilled);
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException();
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width * 2) + (length * 2);
    }
}
