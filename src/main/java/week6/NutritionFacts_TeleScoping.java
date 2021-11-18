package week6;

public class NutritionFacts_TeleScoping {

	private final int servingSize; // mL required
	private final int servings; // required
	private final int calories; // optional
	private final int fat; // optional
	private final int sodium; // optional
	private final int carbohydrate; // optional

	// only required
	public NutritionFacts_TeleScoping(int servingSize, int servings) {

		this(servingSize, servings, 0, 0, 0, 0);

	}

	// required and optional
	public NutritionFacts_TeleScoping(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {

		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;

	}

	public int getServingSize() {
		return servingSize;
	}

	public int getServings() {
		return servings;
	}

	public int getCalories() {
		return calories;
	}

	public int getFat() {
		return fat;
	}

	public int getSodium() {
		return sodium;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

}
