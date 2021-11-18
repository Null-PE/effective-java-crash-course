package week6;

public class App {

	public static void main(String[] args) {

		NutritionFacts_TeleScoping cocaCola = new NutritionFacts_TeleScoping(240, 8, 100, 35, 27, 0);

		NutritionFacts_JavaBean pepsi = new NutritionFacts_JavaBean();
		pepsi.setServingSize(240);
		pepsi.setServings(240);
		pepsi.setCalories(100);
		pepsi.setSodium(100);
		pepsi.setCarbohydrate(100);

	}

}
