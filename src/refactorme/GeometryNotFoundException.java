package refactorme;

/**
 * This exception is thrown when a geometry is not found.
 */
public class GeometryNotFoundException extends RuntimeException {
    public GeometryNotFoundException(String message) {
        super(message);
    }
}
