package generics_shape;

public class ShapeTest {
public static void main(String[] args) {
		
		ShapeBox<Circle> round = new ShapeBox<>(new Circle());
		ShapeBox<Rectangle> edge = new ShapeBox<>(new Rectangle());
		round.drawShape();
		edge.drawShape();
	}
}
