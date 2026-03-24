package refactorme;

/**
 * Main class to test the program.
 */
public class DrawIt {

    public static void main(String[] args) {

        GeometryCollection collection = new GeometryCollection();

        Circle circle = new Circle(1, true, "red", 4);
        collection.add(circle);

        System.out.println("Area: " + circle.calculateArea());

        Rectangle rect = new Rectangle(2, false, "blue", 4, 5);
        collection.add(rect);

        Square square = new Square(3, true, "green", 2);
        collection.add(square);

        System.out.println(collection.getById(1) != null);

        try {
            collection.removeById(4);
        } catch (GeometryNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(collection.getById(4) != null);
    }
}