package week4.model;

import week4.model.vo.ProductAnswer;

public class Main {

	public static void main(String[] args) {

		ProductAnswer p = new ProductAnswer(1, "test", 3, ProductAnswer.ConditionCategory.NEW,
				ProductAnswer.ConditionRate.MINT);

		String name = p.getName();
		name = "a";
		System.out.println(p.getName());

	}
}
