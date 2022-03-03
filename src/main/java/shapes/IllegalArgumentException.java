package shapes;

public class IllegalArgumentException extends Exception {

    public void trigrtIllegalArgumentException() throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "Value too small";
    }
}
