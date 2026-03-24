package refactorme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Collection for geometry elements.
 *
 * Refactoring goals:
 * Fast and safe lookup by id.
 * Enforce unique ids at the moment of adding.
 */
public class GeometryCollection<T extends Geometry> {

    private final Map<Integer, T> byId = new HashMap<>();
    private final List<T> elements = new ArrayList<>();

    /**
     * Adds an element.
     *
     * @throws DuplicateIdException when another element with the same id already exists
     */
    public void add(T element) throws DuplicateIdException {
        if (element == null) {
            throw new IllegalArgumentException("Element must not be null");
        }
        int id = element.getId();
        if (byId.containsKey(id)) {
            throw new DuplicateIdException(id);
        }
        byId.put(id, element);
        elements.add(element);
    }

    /**
     * Removes an element by reference.
     *
     * @return true if it was removed
     */
    public boolean remove(T element) {
        if (element == null) {
            return false;
        }
        T removed = byId.remove(element.getId());
        if (removed == null) {
            return false;
        }
        elements.remove(removed);
        return true;
    }

    public boolean contains(T element) {
        return element != null && byId.containsKey(element.getId());
    }

    /**
     * Returns the element with the given id.
     */
    public T getById(int id) throws GeometryNotFoundException {
        T element = byId.get(id);
        if (element == null) {
            throw new GeometryNotFoundException(id);
        }
        return element;
    }

    /**
     * @return unmodifiable view of the internal list, useful for printing or sorting
     */
    public List<T> asList() {
        return Collections.unmodifiableList(elements);
    }
}
