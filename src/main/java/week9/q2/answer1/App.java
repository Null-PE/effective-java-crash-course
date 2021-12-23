package week9.q2.answer1;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<AbstractFigure> AbstractFigures = createAbstractFigures();
		System.out.println(sumAreas(AbstractFigures));
	}

	private static List<AbstractFigure> createAbstractFigures() {
		List<AbstractFigure> AbstractFigures = new ArrayList<AbstractFigure>();
		AbstractFigures.add(new Circle(10));
		AbstractFigures.add(new Rectangle(3, 5));
		return AbstractFigures;
	}

	private static double sumAreas(List<AbstractFigure> displays) {

		double sum = 0;
		for (AbstractFigure AbstractFigure : displays) {
			sum += AbstractFigure.area();
		}
		return sum;
	}

}
