package week2;

public class JpPhoneNumberFormatter {

	// XXX-XXXX-XXXX
	public static String formatAsStringWithHyphen(JpPhoneNumber jpPhoneNumber) {
		return jpPhoneNumber.getAreaCodeWithZeroPrefix() + "-" + jpPhoneNumber.getCityCode() + "-"
				+ jpPhoneNumber.getSubscriberNumber();
	}

	// (XXX)XXXX-XXXX
	public static String formatAsStringWithParenthesesAndHyphen(JpPhoneNumber jpPhoneNumber) {
		return null;
	}

	// XXX (XXXX) XXXX
	public static String formatAsStringWithParenthesesAndBlank(JpPhoneNumber jpPhoneNumber) {
		return null;
	}

}
