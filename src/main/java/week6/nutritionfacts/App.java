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
		NutritionFacts_1_TelescopingConstructor eightBottolesOfCoke = new NutritionFacts_1_TelescopingConstructor(240, 8, 0, 0, 0, 0);

		// JavaBeanパターン1
		// ○:可読性:何をセットしているかがわかりやすい
		// ×:安全性:requiredを強制できない
		// ×:安全性:不変オブジェクトにできない
		NutritionFacts_2_JavaBean twoBottolsOfPepsi = new NutritionFacts_2_JavaBean();
		twoBottolsOfPepsi.setServingSize(240);
		twoBottolsOfPepsi.setServings(2);
		twoBottolsOfPepsi.setCalories(0);
		twoBottolsOfPepsi.setSodium(0);
		twoBottolsOfPepsi.setCarbohydrate(0);

		// JavaBeanパターンの改善
		// ○:可読性:何をセットしているかがわかりやすい
		// ○:安全性:requiredを強制できる
		// ×:安全性:不変オブジェクトにできない
		NutritionFacts_3_JavaBean_Required aBottolOfRedbull = new NutritionFacts_3_JavaBean_Required(240, 1);
		aBottolOfRedbull.setCalories(35);
		aBottolOfRedbull.setSodium(27);
		aBottolOfRedbull.setCarbohydrate(0);

		// 変更可能
		aBottolOfRedbull.setCarbohydrate(1);

		// Builderパターン
		// ○:可読性:何をセットしているかがわかりやすい
		// ○:安全性:requiredを強制できる
		// ○:安全性:不変オブジェクトにできなる
		NutritionFacts_4_Builder aBottolOfMonster = new NutritionFacts_4_Builder.Builder(240, 1).calories(35).sodium(27)
				.carbohydrate(0).build();
	}

}
