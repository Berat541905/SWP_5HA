package refactorme;

/**
 * Rectangle with width and height.
 */
public class Rectangle extends Geometry {

    private final double width;
    private final double height;

    /**
     * Creates a rectangle.
     *
     * Changes:
     * Invalid values now throw an exception instead of printing a message and continuing.
     * This makes errors visible and testable.
     */
    public Rectangle(int id, double width, double height, boolean filled, String color) {
        super(id, filled, color);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be greater than 0");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
