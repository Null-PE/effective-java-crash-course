package week1.domain.value;

import java.time.LocalDate;

//TODO2 省略されている extends句を記載せよ(select Product and right click -> open type hierarchy in eclipse)
public class Product {

	// TODO1 以下を満たすようにリファクタリングせよ
	// id,userName,price releaseDateの値はコンストラクタでセットし、1度セットした後に変更が不可、参照のみ
	// ITEM 16 17
	public long id;
	public String name;
	public long price;
	public LocalDate releaseDate;
}
