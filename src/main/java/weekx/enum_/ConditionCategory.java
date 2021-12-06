package weekx.enum_;

public enum ConditionCategory {

	NEW(0),

	USED(1);

	private final int id;// finalは明示的につける

	private ConditionCategory(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	// 既存の値との互換せいのために逆引きを用意するパターン
	public static ConditionCategory fromInt(int id) {
		for (ConditionCategory type : values()) {
			if (type.getId() == id) {
				return type;
			}
		}
		throw new IllegalArgumentException("id should be 0, 1 or 2");// nullは返さない
	}

	public static ConditionCategory fromInt(int id) {
		// TODO 実装必要
		throw new IllegalArgumentException("未実装");
	}

}
