package week2.answer;

import java.util.Objects;
import java.util.regex.Pattern;

import com.google.common.base.MoreObjects;

public class JpPhoneNumber implements Comparable<JpPhoneNumber> {

	public static final Pattern PATTERN_JP_PHONE_NUMBER = Pattern.compile("0\\d{1,3}-\\d{1,4}-\\d{4}");

	private final String areaCodeWithZeroPrefix; // 0 + 市外局番 1 to 3 digets https://www.soumu.go.jp/main_content/000141817.pdf
	private final String cityCode; // 市内局番 1 to 4 digets
	private final String subscriberNumber; // 4 digets

	private int hashCode = 0;

	private JpPhoneNumber(String areaCodeWithZeroPrefix, String cityCode, String subscriberNumber) {
		this.areaCodeWithZeroPrefix = areaCodeWithZeroPrefix;
		this.cityCode = cityCode;
		this.subscriberNumber = subscriberNumber;
	}

	public static JpPhoneNumber parse(String jpPhoneNumber) {

		Objects.requireNonNull(jpPhoneNumber);
		if (!PATTERN_JP_PHONE_NUMBER.matcher(jpPhoneNumber).matches()) {
			throw new IllegalArgumentException("invalid phoneNumber format");
		}

		String[] digets = jpPhoneNumber.split("-");
		return new JpPhoneNumber(digets[0], digets[1], digets[2]);
	}

	public static JpPhoneNumber of(String areaCodeWithZeroPrefix, String cityCode, String subscriberNumber) {

		Objects.requireNonNull(areaCodeWithZeroPrefix);
		Objects.requireNonNull(cityCode);
		Objects.requireNonNull(subscriberNumber);
		String.join("-", new String[] { areaCodeWithZeroPrefix, cityCode, subscriberNumber });
		return parse(areaCodeWithZeroPrefix + "-" + cityCode + "-" + subscriberNumber);

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

	@Override
	public int compareTo(JpPhoneNumber o) {

		int result = this.areaCodeWithZeroPrefix.compareTo(o.areaCodeWithZeroPrefix);
		if (result == 0) {
			result = this.cityCode.compareTo(o.cityCode);
			if (result == 0) {
				result = this.subscriberNumber.compareTo(o.subscriberNumber);
			}
		}
		return result;
	}

	@Override
	public String toString() {
		MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(this);
		helper.addValue(this.areaCodeWithZeroPrefix);
		helper.addValue(this.cityCode);
		helper.addValue(this.subscriberNumber);
		return helper.toString();
	}

	@Override
	public int hashCode() {
		if (hashCode == 0) {
			hashCode = Objects.hash(areaCodeWithZeroPrefix, cityCode, subscriberNumber);
		}
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return equalTo(obj);
	}

	private boolean equalTo(Object obj) {
		JpPhoneNumber other = (JpPhoneNumber) obj;
		if (areaCodeWithZeroPrefix == null) {
			if (other.areaCodeWithZeroPrefix != null)
				return false;
		} else if (!areaCodeWithZeroPrefix.equals(other.areaCodeWithZeroPrefix))
			return false;
		if (cityCode == null) {
			if (other.cityCode != null)
				return false;
		} else if (!cityCode.equals(other.cityCode))
			return false;
		if (subscriberNumber == null) {
			if (other.subscriberNumber != null)
				return false;
		} else if (!subscriberNumber.equals(other.subscriberNumber))
			return false;
		return true;
	}

}
