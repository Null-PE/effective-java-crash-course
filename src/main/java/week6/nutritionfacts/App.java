package week6.nutritionfacts;

public class App {

	public static void main(String[] args) {

		// 課題
		// - 可読性
		// - 安全性:requiredを強制したい
		// - 設計性:不変オブジェクトにしたい

		// テレスコーピングパターン
		// ×:可読性:書く時も読むときも何番目がどの引数かがわかりにくい
		// ○:安全性:requiredを強制できる
		// ○:安全性:不変オブジェクトにできる
		NutritionFacts_1_TeleScoping cocaCola = new NutritionFacts_1_TeleScoping(240, 8, 100, 35, 27, 0);

		// JavaBeanパターン1
		// ○:可読性:何をセットしているかがわかりやすい
		// ×:安全性:requiredを強制できない
		// ×:安全性:不変オブジェクトにできない
		NutritionFacts_2_JavaBean pepsi = new NutritionFacts_2_JavaBean();
		pepsi.setServingSize(240);
		pepsi.setServings(8);
		pepsi.setCalories(35);
		pepsi.setSodium(27);
		pepsi.setCarbohydrate(0);

		// JavaBeanパターンの改善
		// ○:可読性:何をセットしているかがわかりやすい
		// ○:安全性:requiredを強制できる
		// ×:安全性:不変オブジェクトにできない
		NutritionFacts_3_JavaBean_Required redbull = new NutritionFacts_3_JavaBean_Required(240, 8);
		redbull.setCalories(35);
		redbull.setSodium(27);
		redbull.setCarbohydrate(0);

		// 変更可能
		redbull.setCarbohydrate(1);

		// Builderパターン
		// ○:可読性:何をセットしているかがわかりやすい
		// ○:安全性:requiredを強制できる
		// ○:安全性:不変オブジェクトにできなる
		NutritionFacts_4_Builder monster = new NutritionFacts_4_Builder.Builder(240, 8).calories(35).sodium(27)
				.carbohydrate(0).build();
	}

}
