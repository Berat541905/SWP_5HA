package refactorme;

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores and manages multiple geometry objects.
 */
public class GeometryCollection {

    private List<Geometry> elements = new ArrayList<>();

    /**
     * Adds a new geometry to the list.
     * Throws an exception if the id already exists.
     */
    public void add(Geometry geometry) {
        if (getById(geometry.getId()) != null) {
            throw new DuplicateIdException("ID already exists: " + geometry.getId());
        }
        elements.add(geometry);
    }

    /**
     * Returns a geometry by its id.
     * Returns null if not found.
     */
    public Geometry getById(int id) {
        for (Geometry g : elements) {
            if (g.getId() == id) {
                return g;
            }
        }
        return null;
    }

    /**
     * Removes a geometry by id.
     * Throws an exception if not found.
     */
    public boolean removeById(int id) {
        Geometry g = getById(id);
        if (g == null) {
            throw new GeometryNotFoundException("No geometry with id: " + id);
        }
        return elements.remove(g);
    }
}