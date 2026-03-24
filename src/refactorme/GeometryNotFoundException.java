package refactorme;

/**
 * Thrown when a geometry element cannot be found by id.
 */
public class GeometryNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public GeometryNotFoundException(int id) {
        super("No such element with id: " + id);
    }
}
