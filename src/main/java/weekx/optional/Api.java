package weekx.optional;

import java.util.Optional;

public class Api {

	public static String returnValOrNull(String key) {

		if ("key".equals(key)) {
			return "key";
		}

		return null;
	}

	public static String returnValOrThrowException(String key) throws ValueNotFoundException {

		if ("key".equals(key)) {
			return "key";
		}

		throw new ValueNotFoundException();
	}

	public static Optional<String> returnOptional() {
		return Optional.empty();
	}

}
