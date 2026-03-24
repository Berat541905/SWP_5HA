package refactorme;

/**
 * This class represents a circle.
 */
public class Circle extends Geometry {

    private double radius;

    /**
     * Creates a circle with a given radius.
     */
    public Circle(int id, boolean filled, String color, double radius) {
        super(id, filled, color);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius muss größer als 0 sein");
        }
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter of the circle.
     */
    @Override
    public double calculatePeripherie() {
        return 2 * Math.PI * radius;
    }
}