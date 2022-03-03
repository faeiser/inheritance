package shapes;

public class Square extends Rectangle {

    public Square(String color, boolean isFilled, double width)
            throws IllegalArgumentException {
        super(color, isFilled, width, width);
    }
}
