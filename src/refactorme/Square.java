package refactorme;

/**
 * Square as a special rectangle where both sides are equal.
 *
 * Reason: In the original code Square duplicated Rectangle and even allowed different width and height.
 * This version keeps one source of truth by reusing Rectangle.
 */
public class Square extends Rectangle {

    public Square(int id, double sideLength, boolean filled, String color) {
        super(id, sideLength, sideLength, filled, color);
    }

    public double getSideLength() {
        return getWidth();
    }
}
