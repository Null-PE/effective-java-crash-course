package weekx.optional;

import java.util.Optional;

public class Client {

	public static void main(String[] args) {

		// APIがnullを返すパターン
		// APIを使う側がnullチェックが必要だが、nullチェックは強制されない
		String s = Api.returnValOrNull("A");
		if (s == null) {
			System.out.println("null");
			s = "abc";
		}

		// APIが例外を返すパターン
		// APIを使う側が例外のハンドリングが必要（チェック例外の場合）
		try {
			s = Api.returnValOrThrowException("B");
		} catch (ValueNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// APIがOptionalを返すパターン
		// 使う側にnullの時があると型で伝えら、対応を強制できる
		// 使う側がnullの時に別の値を返すのか、例外を投げるかを選択できる。
		Optional<String> optional = Api.returnOptional();
		optional.orElse("abc");

		try {
			Optional<String> optional2 = Api.returnOptional();
			optional2.orElseThrow(ValueNotFoundException::new);
		} catch (ValueNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
