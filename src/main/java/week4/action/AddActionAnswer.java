package week4.action;

import week4.model.dao.ProductDaoAnswer;
import week4.model.vo.Product;
import week4.model.vo.ProductAnswer;
import week4.model.vo.ProductAnswer.ConditionCategory;
import week4.model.vo.ProductAnswer.ConditionRate;

public class AddActionAnswer {

	public void execute(String name, int price, ConditionCategory conditionCategory, ConditionRate conditionRate) {

		ProductAnswer product = new ProductAnswer(Product.DEFAULT_ID, name, price, conditionCategory, conditionRate);
		new ProductDaoAnswer().insert(product);

	}

}
