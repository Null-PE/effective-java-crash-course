package weekx.enum_;

public class Main {

	public static void main(String[] args) {

		// マジックナンバーを防ぎ、関連性を強調し、
		// 可読性をあげる
		// int enum
		new Product(0);
		new Product(Product.NEW);
		int conditionCategoryId = 1;

		switch (conditionCategoryId) {
		case 0:
			System.out.println("NEW");
			break;
		case 1:
			System.out.println("USED");
			break;
		default:
			throw new IllegalArgumentException();
		}

		// enum
		new Product(ConditionCategory.NEW);
		ConditionCategory conditionCategory = ConditionCategory.NEW;

		switch (conditionCategory) {
		case NEW:
			System.out.println("NEW");
			break;
		case USED:
			System.out.println("USED");
			break;
		default:
			throw new IllegalArgumentException();
		}

		// 範囲外の指定を防ぎ、安全性をあげる
		// 逆引きする場合は同じ
		try {
			// int enum
			new Product(3);
			// enum
			// そもそも書けない
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		// 逆引きできる場合はあまり違いなし
		try {
			// int enum
			ConditionCategory.valueOf("NEWS");
			// そもそも書けない
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		try {
			// int enum
			ConditionCategory.of(4);
			// そもそも書けない
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		// プロパティを複数持てる。
		// https://github.com/spring-projects/spring-boot/blob/2d2cbff504ae80d82ba628115f972cd40604616b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/jdbc/DataSourceBuilder.java

		// メソッドを持てる
		// https://qiita.com/jver/items/f3485f4fd9c47625d7a4
	}

}
