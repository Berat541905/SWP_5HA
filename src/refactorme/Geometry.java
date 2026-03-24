package refactorme;

import java.util.Objects;

/**
 * Base type for all geometrical objects in this small project.
 *
 * Design decision:
 * Each shape knows its id, color and filled flag.
 * The actual formula for area and perimeter belongs to each concrete shape.
 *
 * This removes the width and height fields from the base class because they do not fit circles.
 */
public abstract class Geometry implements Comparable<Geometry> {

    private final int id;
    private final boolean filled;
    private final String color;

    /**
     * Creates a geometry element.
     *
     * @param id unique identifier inside a {@link GeometryCollection}
     * @param filled whether the element is filled
     * @param color simple color name
     * @throws IllegalArgumentException when id is negative or color is null or blank
     */
    protected Geometry(int id, boolean filled, String color) {
        if (id < 0) {
            throw new IllegalArgumentException("Id must be 0 or greater");
        }
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("Color must not be empty");
        }
        this.id = id;
        this.filled = filled;
        this.color = color;
    }

    /**
     * @return area of the geometry element
     */
    public abstract double calculateArea();

    /**
     * @return perimeter of the geometry element
     */
    public abstract double getPerimeter();

    public final int getId() {
        return id;
    }

    public final boolean isFilled() {
        return filled;
    }

    public final String getColor() {
        return color;
    }

    /**
     * Sort by area.
     */
    @Override
    public final int compareTo(Geometry other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    /**
     * Equality is based on id.
     *
     * Reason: the collection uses ids as stable identifiers.
     */
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Geometry)) {
            return false;
        }
        Geometry geometry = (Geometry) o;
        return id == geometry.id;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(id=" + id + ", color=" + color + ", filled=" + filled + ")";
    }
}
