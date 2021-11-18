package week6;

public class NutritionFacts_JavaBean_Required {

	private int servingSize; // 1個分の分量 mL required
	private int servings; // 1箱あたり何個 required
	private int calories; // 1個分のカロリー optional
	private int fat; // 1個分の脂肪　optional
	private int sodium; // 1個分の塩分 optional
	private int carbohydrate; // 1個分の糖質 optional

	public NutritionFacts_JavaBean_Required(int servingSize, int servings) {
		this.servingSize = servingSize;
		this.servings = servings;
	}

	public int getServingSize() {
		return servingSize;
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getSodium() {
		return sodium;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

}
