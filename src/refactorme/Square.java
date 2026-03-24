package refactorme;

/**
 * This class represents a square.
 * A square is just a rectangle with equal sides.
 */
public class Square extends Rectangle {

    /**
     * Creates a square with one side.
     */
    public Square(int id, boolean filled, String color, double side) {
        super(id, filled, color, side, side);
    }
}
