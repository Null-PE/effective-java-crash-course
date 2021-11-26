package week6.nutritionfacts;

public class NutritionFacts_2_JavaBean {

	// require
	private int servingSize; // 1個分の分量
	private int servings; // 1パッケージあたり何個

	// optional
	private int calories; // 1個分のカロリー
	private int fat; // 1個分の脂肪
	private int sodium; // 1個分の塩分
	private int carbohydrate; // 1個分の糖質

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
