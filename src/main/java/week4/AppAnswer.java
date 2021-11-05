package week4;

import week4.action.AddActionAnswer;
import week4.model.vo.ProductAnswer.ConditionCategory;
import week4.model.vo.ProductAnswer.ConditionRate;

public class AppAnswer {

	public static final int COMMAND_ADD = 0;

	public static void main(String[] args) {

		int commandType = Integer.valueOf(args[0]);
		String name = args[1];
		int price = Integer.valueOf(args[2]);
		ConditionCategory conditionCategory = ConditionCategory.of(Integer.valueOf(args[3]));
		ConditionRate conditionRate = ConditionRate.of(Integer.valueOf(args[4]));

		if (commandType == COMMAND_ADD) {
			new AddActionAnswer().execute(name, price, conditionCategory, conditionRate);
		}

	}

}
