package week9.q1;

// TODO create abstract class or interface and refactor this class;
public class Figure_Before {

	enum Shape {
		RECTANGLE, CIRCLE
	};

	final Shape shape;

	double length;
	double width;

	double radius;

	// constructor for circle
	Figure_Before(double radius) {
		shape = Shape.CIRCLE;
		this.radius = radius;
	}

	// constructor for rectangle
	Figure_Before(double length, double width) {
		this.shape = Shape.CIRCLE;
		this.length = length;
		this.width = width;
	}

	double area() {
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
