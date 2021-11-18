package week6;

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
		NutritionFacts_TeleScoping cocaCola = new NutritionFacts_TeleScoping(240, 8, 100, 35, 27, 0);

		// JavaBeanパターン1
		// ○:可読性:何をセットしているかがわかりやすい
		// ×:安全性:requiredを強制できない
		// ×:安全性:不変オブジェクトにできない
		NutritionFacts_JavaBean pepsi = new NutritionFacts_JavaBean();
		pepsi.setServingSize(240);
		pepsi.setServings(240);
		pepsi.setCalories(100);
		pepsi.setSodium(100);
		pepsi.setCarbohydrate(100);

		// JavaBeanパターンの改善
		// ○:可読性:何をセットしているかがわかりやすい
		// ○:安全性:requiredを強制できる
		// ×:安全性:不変オブジェクトにできない
		NutritionFacts_JavaBean_Required redbull = new NutritionFacts_JavaBean_Required(240, 240);
		redbull.setCalories(100);
		redbull.setSodium(100);
		redbull.setCarbohydrate(100);

		// TODO implement this class by using builder pattern
		// NutritionFacts_JavaBean_Requiredの可読性を持ったまま、不変オブジェクトにする
		
	}

}
