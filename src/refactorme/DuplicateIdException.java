package refactorme;

/**
 * Thrown when an element with the same id already exists in a {@link GeometryCollection}.
 *
 * Reason: In the original code the uniqueness check compared the new id only with the default value
 * of a single object. Real uniqueness must be enforced across the whole collection.
 */
public class DuplicateIdException extends Exception {
    private static final long serialVersionUID = 1L;

    public DuplicateIdException(int id) {
        super("Id must be unique. Duplicate id: " + id);
    }
}
