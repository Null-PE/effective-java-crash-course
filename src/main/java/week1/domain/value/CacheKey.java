package week1.domain.value;

public class CacheKey {

	private long condId;
	private long usrId;

	public CacheKey(long condId, long usrId) {
		this.condId = condId;
		this.usrId = usrId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CacheKey other = (CacheKey) obj;
		if (condId != other.condId)
			return false;
		if (usrId != other.usrId)
			return false;
		return true;
	}

}
