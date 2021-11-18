package week6.nutritionfacts;

//https://www.fda.gov/food/new-nutrition-facts-label/how-understand-and-use-nutrition-facts-label
//https://www.google.com/search?q=NutritionFacts+label+cola&rlz=1C5CHFA_enJP822JP822&tbm=isch&source=iu&ictx=1&fir=WnMwvizhTMIL7M%252CF0wFBBFYUtxQzM%252C_%253Bdal3rmACPmVdYM%252CZ-SJ7vSlGcICbM%252C_%253BMw-9J64GPXocVM%252CJxLuQvxpXhBqKM%252C_%253Bgd1_IMdZ87fLEM%252CIDCyuaXk3K_qwM%252C_%253Ba7knl2YsV-587M%252CF0wFBBFYUtxQzM%252C_%253BJZ6M607kuM1eXM%252CRC6nCdHImROq_M%252C_%253BMYU9sWiFQeIkUM%252C8oi_qAhDe_E_kM%252C_%253Brw7iJe-tH_m8fM%252CF0wFBBFYUtxQzM%252C_%253BiPfwpj3JxWyB9M%252COD_fUdBfSC9-HM%252C_%253BJ2lXtTToctE35M%252CF0wFBBFYUtxQzM%252C_&vet=1&usg=AI4_-kSM0mytSViG3Jl7ALiMAY6D-1BfNQ&sa=X&ved=2ahUKEwjUnaWvuKH0AhXqyosBHV_LABgQ9QF6BAgGEAE#imgrc=dal3rmACPmVdYM
public class NutritionFacts_1_TeleScoping {
	
	// require
	private final int servingSize; // 1個分の分量  
	private final int servings; // 1パッケージあたり何個 
	
	// optional
	private final int calories; // 1個分のカロリー 
	private final int fat; // 1個分の脂肪 
	private final int sodium; // 1個分の塩分 
	private final int carbohydrate; // 1個分の糖質 

	// only required
	public NutritionFacts_1_TeleScoping(int servingSize, int servings) {
		this(servingSize, servings, 0, 0, 0, 0);
	}

	// required and optional
	public NutritionFacts_1_TeleScoping(int servingSize, int servings, int calories, int fat, int sodium,
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
