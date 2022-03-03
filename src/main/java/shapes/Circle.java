package shapes;

import java.lang.Math;

public class Circle extends Shape {

    double radius;
    final double pi = Math.PI;

    public Circle(String color, boolean isFilled, double radius) throws IllegalArgumentException {
        super(color, isFilled);
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (pi * (radius*radius));
    }

    @Override
    public double getPerimeter() {
        return (2 * radius) * pi;
    }
}
