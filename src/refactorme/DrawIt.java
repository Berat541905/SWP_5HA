package refactorme;

/**
 * Small demo program.
 *
 * Changes compared to the original:
 * Uses the refactored exceptions.
 * Shows the error message when an element does not exist.
 */
public class DrawIt {

    public static void main(String[] args) {

        Geometry filledGreyRect = new Rectangle(1, 2, 6, true, "grey");
        Geometry unfilledBlueRect = new Rectangle(2, 8, 9, false, "blue");
        Geometry filledGreyCircle = new Circle(3, 3, true, "grey");
        Geometry unfilledRedCircle = new Circle(4, 3, false, "red");

        GeometryCollection<Geometry> construction = new GeometryCollection<>();

        try {
            construction.add(filledGreyRect);
            construction.add(unfilledBlueRect);
            construction.add(filledGreyCircle);
            construction.add(unfilledRedCircle);

            System.out.println("The area of the object is: " + construction.getById(4).calculateArea());
            System.out.println(construction.contains(unfilledRedCircle));

            construction.remove(unfilledRedCircle);

            try {
                System.out.println(construction.getById(4).calculateArea());
            } catch (GeometryNotFoundException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(construction.contains(unfilledRedCircle));

        } catch (DuplicateIdException e) {
            System.out.println(e.getMessage());
        } catch (GeometryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
