package refactorme;

/**
 * Circle described by its radius.
 */
public class Circle extends Geometry {

    private final double radius;

    /**
     * Creates a circle.
     *
     * Changes:
     * Removed duplicated fields id, filled and color because they are already in {@link Geometry}.
     * Radius is immutable here to keep the object stable after it was added to a collection.
     */
    public Circle(int id, double radius, boolean filled, String color) {
        super(id, filled, color);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
