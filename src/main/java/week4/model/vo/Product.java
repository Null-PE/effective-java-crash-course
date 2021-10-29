package week4.model.vo;

import java.util.Objects;

import com.google.common.base.MoreObjects;

// TODO 0 ITEM 17 不変オブジェクトに変更する
public class Product {

	// TODO 1 ITEM 34 change to Enum 
	public static int NEW = 1;
	public static int USED = 2;
	public static int VINTAGE = 3;

	// TODO 2 ITEM 34 change to Enum
	public static int MINT = 1;
	public static int GOOD = 2;
	public static int FAIR = 3;
	public static int POOR = 4;

	public static int DEFAULT_ID = 0;

	private long id;
	private String name;
	private int price;
	// TODO 1 change to Enum
	private int conditionCategory;
	private int conditionRate;

	private int hashCode = 0;

	public Product(long id, String name, int price, int conditionCategory, int conditionRate) {

		if (conditionCategory != NEW || conditionCategory != USED || conditionCategory != VINTAGE) {
			throw new IllegalArgumentException();
		}

		if (conditionRate != MINT || conditionRate != GOOD || conditionRate != FAIR || conditionRate != POOR) {
			throw new IllegalArgumentException();
		}

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

	public int getConditionCategory() {
		return conditionCategory;
	}

	public int getConditionRate() {
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
			hashCode = Objects.hash(Long.valueOf(id), name, price, Long.valueOf(conditionCategory),
					Long.valueOf(conditionRate));
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

		return equalTo((Product) obj);
	}

	private boolean equalTo(Product another) {
		return Objects.equals(Long.valueOf(id), Long.valueOf(another.getId()))
				&& Objects.equals(name, another.getName()) && Objects.equals(price, another.getPrice())
				&& Objects.equals(conditionCategory, another.getConditionCategory())
				&& Objects.equals(conditionRate, another.getConditionRate());
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setConditionCategory(int conditionCategory) {
		this.conditionCategory = conditionCategory;
	}

	public void setConditionRate(int conditionRate) {
		this.conditionRate = conditionRate;
	}

}
