package refactorme;

/**
 * Base class for all geometric shapes.
 * Every shape has an id, a color and can be filled.
 */
public abstract class Geometry {

    protected int id;
    protected boolean filled;
    protected String color;

    /**
     * Creates a geometry object.
     */
    public Geometry(int id, boolean filled, String color) {
        this.id = id;
        this.filled = filled;
        this.color = color;
    }

    /**
     * Returns the id of the object.
     */
    public int getId() {
        return id;
    }

    /**
     * Calculates the area of the shape.
     */
    public abstract double calculateArea();

    /**
     * Calculates the perimeter of the shape.
     */
    public abstract double calculatePeripherie();
}