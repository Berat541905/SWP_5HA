package refactorme;

/**
 * This exception is thrown when an id is used more than once.
 */
public class DuplicateIdException extends RuntimeException {
    public DuplicateIdException(String message) {
        super(message);
    }
}