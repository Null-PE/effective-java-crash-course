package week4.action;

import week4.model.dao.ProductDao;
import week4.model.vo.Product;

public class AddAction {

	public void execute(String name, int price, int conditionCategory, int conditionRate) {

		Product product = new Product(Product.DEFAULT_ID, name, price, conditionCategory, conditionRate);
		new ProductDao().insert(product);
	
	}

}
