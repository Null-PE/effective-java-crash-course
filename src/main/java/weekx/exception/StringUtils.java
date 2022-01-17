package weekx.exception;

import java.util.Objects;
import java.util.Optional;

public class StringUtils {

	// APIとしどちらがいいだろう？ ITEM70
	// TODO javadocを書こう ITEM74
	public static String capitalizeOrThrowsException(String str) {

		Objects.requireNonNull(str);
		if (str.length() == 0) {
			throw new IllegalArgumentException();
		}

		return str.substring(0, 1).toUpperCase() + str.substring(1);

	}

	public static String capitalizeOrNull(String str) {

		if (str == null || str.length() == 0) {
			return str;
		}

		return str.substring(0, 1).toUpperCase() + str.substring(1);

	}

	public static Optional<String> capitalizeOptional(String str) {

		if (str == null || str.length() == 0) {
			return Optional.empty();
		}

		return Optional.of(str.substring(0, 1).toUpperCase() + str.substring(1));

	}

}
