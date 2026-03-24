package generics_shape;

public class ShapeBox<T extends Shape> {
	
	private T shape;

    public ShapeBox(T shape) {
        this.shape = shape;
    }

    public void drawShape() {
        shape.draw();
    }
}

