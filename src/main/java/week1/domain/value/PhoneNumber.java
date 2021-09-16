package week1.domain.value;

public class PhoneNumber {

	private int areaCode;
	private int prefix;
	private int lineNum;

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		super();
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.lineNum = lineNum;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public int getPrefix() {
		return prefix;
	}

	public int getLineNum() {
		return lineNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		if (areaCode != other.areaCode)
			return false;
		if (lineNum != other.lineNum)
			return false;
		if (prefix != other.prefix)
			return false;
		return true;
	}

}
