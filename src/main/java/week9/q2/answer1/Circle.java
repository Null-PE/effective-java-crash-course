package week9.q2.answer1;

public class Circle extends AbstractFigure {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * (radius * radius);
	}

}
