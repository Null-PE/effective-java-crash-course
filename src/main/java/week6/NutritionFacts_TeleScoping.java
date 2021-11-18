package week6;

public class NutritionFacts_TeleScoping {

	private final int servingSize; // 1個分の分量 mL required
	private final int servings; // 1箱あたり何個 required
	private final int calories; // 1個分のカロリー optional
	private final int fat; // 1個分の脂肪 optional
	private final int sodium; // 1個分の塩分 optional
	private final int carbohydrate; // 1個分の糖質 optional

	// only required
	public NutritionFacts_TeleScoping(int servingSize, int servings) {
		this(servingSize, servings, 0, 0, 0, 0);
	}

	// required and optional
	public NutritionFacts_TeleScoping(int servingSize, int servings, int calories, int fat, int sodium,
			int carbohydrate) {

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
