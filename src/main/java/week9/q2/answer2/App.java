package week9.q2.answer2;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Figure> figures = createFigures();
		System.out.println(sumAreas(figures));
	}

	private static List<Figure> createFigures() {
		List<Figure> figures = new ArrayList<Figure>();
		figures.add(new Circle(10));
		figures.add(new Rectangle(3, 5));
		return figures;
	}

	private static double sumAreas(List<Figure> displays) {

		double sum = 0;
		for (Figure figure : displays) {
			sum += figure.area();
		}
		return sum;
	}

}
