package week9.q2;

// TODO create abstract class or interface and refactor this class;
public class Figure {

	enum Shape {
		RECTANGLE, CIRCLE
	};

	final Shape shape;

	double length;
	double width;

	double radius;

	// constructor for circle
	Figure(double radius) {
		shape = Shape.CIRCLE;
		this.radius = radius;
	}

	// constructor for rectangle
	Figure(double length, double width) {
		this.shape = Shape.RECTANGLE;
		this.length = length;
		this.width = width;
	}

	public double area() {
		switch (shape) {
		case RECTANGLE:
			return length * width;
		case CIRCLE:
			return Math.PI * (radius * radius);
		default:
			throw new AssertionError(shape);
		}
	}

}
