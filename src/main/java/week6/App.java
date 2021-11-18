package week6;

public class App {

	public static void main(String[] args) {
		// テレスコーピングパターン
		// 書く時も読むときも何番目がどの引数かがわかりにくい
		NutritionFacts_TeleScoping cocaCola = new NutritionFacts_TeleScoping(240, 8, 100, 35, 27, 0);

		// JavaBeanパターン
		// requiredのセットを強制できない
		// 不変オブジェクトにできない
		NutritionFacts_JavaBean pepsi = new NutritionFacts_JavaBean();
		pepsi.setServingSize(240);
		pepsi.setServings(240);
		pepsi.setCalories(100);
		pepsi.setSodium(100);
		pepsi.setCarbohydrate(100);

		// 不変オブジェクトにできない
		NutritionFacts_JavaBean_Required redbull = new NutritionFacts_JavaBean_Required(240, 240);
		redbull.setCalories(100);
		redbull.setSodium(100);
		redbull.setCarbohydrate(100);

		// TODO implement this class by using builder pattern
		// NutritionFacts_JavaBean_Requiredの可読性を持ったまま、不変オブジェクトにする
		
	}

}
