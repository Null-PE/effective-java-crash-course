package week6.nutritionfacts;

public class NutritionFacts_4_Builder {

	private int servingSize; // mL required
	private int servings; // required
	private int calories; // optional
	private int fat; // optional
	private int sodium; // optional
	private int carbohydrate; // optional

	public static class Builder {
		// required
		private int servingSize; // mL required
		private int servings; // required
		// optional
		private int calories; // optional
		private int fat; // optional
		private int sodium; // optional
		private int carbohydrate; // optional

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int calories) {
			this.calories = calories;
			return this;
		}

		public Builder fat(int fat) {
			this.fat = fat;
			return this;
		}

		public Builder sodium(int sodium) {
			this.sodium = sodium;
			return this;
		}

		public Builder carbohydrate(int carbohydrate) {
			this.carbohydrate = carbohydrate;
			return this;
		}

		public NutritionFacts_4_Builder build() {
			return new NutritionFacts_4_Builder(this);
		}
	}

	private NutritionFacts_4_Builder(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}

}
