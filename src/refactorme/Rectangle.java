package refactorme;

/**
 * This class represents a rectangle.
 */
public class Rectangle extends Geometry {

    protected double width;
    protected double height;

    /**
     * Creates a rectangle with width and height.
     */
    public Rectangle(int id, boolean filled, String color, double width, double height) {
        super(id, filled, color);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Breite und Höhe müssen größer als 0 sein");
        }
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}