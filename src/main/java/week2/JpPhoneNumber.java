package week2;

public class JpPhoneNumber implements Comparable<JpPhoneNumber> {

	// TODO4 implement toString/equals/hashcode/compare

	private String areaCodeWithZeroPrefix; // 0 + 市外局番 1 to 3 digets https://www.soumu.go.jp/main_content/000141817.pdf
	private String cityCode; // 市内局番 1 to 4 digets
	private String subscriberNumber; // 4 digets

	// todo5 implement static factory method
	public JpPhoneNumber(String areaCodeWithZeroPrefix, String cityCode, String subscriberNumber) {
		this.areaCodeWithZeroPrefix = areaCodeWithZeroPrefix;
		this.cityCode = cityCode;
		this.subscriberNumber = subscriberNumber;
	}

	public String getAreaCodeWithZeroPrefix() {
		return areaCodeWithZeroPrefix;
	}

	public String getCityCode() {
		return cityCode;
	}

	public String getSubscriberNumber() {
		return subscriberNumber;
	}

	// todo5 implement static factory method 1
	public static JpPhoneNumber parse(String jpPhoneNumber) {
		// Objects.requireNonNullを使って、nullの場合にNullPointerExceptionを投げる
		if (!jpPhoneNumber.matches("0\\d{1,4}-\\d{1,4}-\\d{4}")) {// TODO 高速化
			throw new IllegalArgumentException("invalid phoneNumber format");
		}

		// TODO implement
		return null;
	}

	// todo5 implement static factory method 2
	// 例外をJavadocに書く
	public static JpPhoneNumber of(String areaCodeWithZeroPrefix, String cityCode, String subscriberNumber) {
		// それぞれnullの場合にNullPointerExceptionを投げる
		// それぞれの入力値がおかしい場合にIllegalArgumentExceptionを投げる
		//
		return new JpPhoneNumber(areaCodeWithZeroPrefix, cityCode, subscriberNumber);
	}

	@Override
	public int compareTo(JpPhoneNumber o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
