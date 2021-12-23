package week9.q2.answer2;

public class Circle implements Figure {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * (radius * radius);
	}

}
