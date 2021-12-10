package week9.q2.answer1;

public class Rectangle extends AbstractFigure {

	private double length;
	private double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

}
