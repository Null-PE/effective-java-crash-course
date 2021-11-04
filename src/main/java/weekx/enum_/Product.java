package weekx.enum_;

public class Product {

	// int enumパターン
	public static final int NEW = 0;
	public static final int OLD = 1;

	private int conditionCategoryIntEnumPattern;

	public Product(int conditionCategoryIntEnumPattern) {

		if (conditionCategoryIntEnumPattern != 0 || conditionCategoryIntEnumPattern != 1) {
			throw new IllegalArgumentException("unsupported value and value should be 0 or 1");
		}

		this.conditionCategoryIntEnumPattern = conditionCategoryIntEnumPattern;
	}

	// enumパターン
	private ConditionCategory conditionCategory;

	public Product(ConditionCategory conditionCategory) {
		this.conditionCategory = conditionCategory;
	}
}
