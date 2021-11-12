package week5.q1.advanced;

public class Calculator {

	public static int calculateHardForTesting(String commandStr, int x, int y) {
		//Enumで受けてしまうパターン
		BasicCommand command = BasicCommand.valueOf(commandStr.toUpperCase());
		return doCalculate(command, x, y);
	}
	
	// このメソッドの単体テストをするためにBasicCommandが必要で、モックできない
	// テスト容易性が低い
	private static int doCalculate(BasicCommand command, int x, int y) {
		return command.execute(x, y);
	}
	
	public static int calculateEasyForTesting(String commandStr, int x, int y) {
		//Enumの実装しているInterfaceで宣言するパターン
		Command command = BasicCommand.valueOf(commandStr.toUpperCase());
		return doCalculate(command, x, y);
	}

	// このメソッドの単体テストをするためにCommandのモックが利用できる
	// テスト容易性が高い
	private static int doCalculate(Command command, int x, int y) {
		return command.execute(x, y);
	}
}
