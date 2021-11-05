package week4.model.vo;

import java.util.Arrays;
import java.util.Objects;

import com.google.common.base.MoreObjects;

public final class ProductAnswer {

	public static int DEFAULT_ID = 0;

	private final long id;
	private final String name;
	private final int price;
	private final ConditionCategory conditionCategory;
	private final ConditionRate conditionRate;

	private int hashCode = 0;

	public ProductAnswer(long id, String name, int price, ConditionCategory conditionCategory,
			ConditionRate conditionRate) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.conditionCategory = conditionCategory;
		this.conditionRate = conditionRate;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public ConditionCategory getConditionCategory() {
		return conditionCategory;
	}

	public ConditionRate getConditionRate() {
		return conditionRate;
	}

	@Override
	public String toString() {
		MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(this);
		helper.add("id", id);
		helper.add("name", name);
		helper.add("price", price);
		helper.add("conditionCategory", conditionCategory);
		helper.add("conditionRate", conditionRate);
		return helper.toString();
	}

	@Override
	public int hashCode() {
		if (hashCode == 0) {
			hashCode = Objects.hash(Long.valueOf(id), name, price, conditionCategory, conditionRate);
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

		return equalTo((ProductAnswer) obj);
	}

	private boolean equalTo(ProductAnswer another) {
		return Objects.equals(Long.valueOf(id), Long.valueOf(another.getId()))
				&& Objects.equals(name, another.getName()) && Objects.equals(price, another.getPrice())
				&& Objects.equals(conditionCategory, another.getConditionCategory())
				&& Objects.equals(conditionRate, another.getConditionRate());
	}

	public enum ConditionCategory {

		NEW(1), OLD(2), VINTAGE(3);

		private final int id;

		ConditionCategory(int id) {
			this.id = id;
		}

		private int getId() {
			return this.id;
		}

		public static ConditionCategory of(int id) {

			for (ConditionCategory type : values()) {
				if (type.getId() == id) {
					return type;
				}
			}
			throw new IllegalArgumentException("id must be 1, 2 or 3");
		}

	}

	public enum ConditionRate {

		MINT(1), GOOD(2), FAIR(3), POOR(4);

		private final int id;

		ConditionRate(int id) {
			this.id = id;
		}

		private int getId() {
			return this.id;
		}

		public static ConditionRate of(int id) {

			return Arrays.stream(values()).filter(e -> e.getId() == id).findFirst()
					.orElseThrow(() -> new IllegalArgumentException("id must be 1, 2, 3 or 4"));

		}

	}

}
