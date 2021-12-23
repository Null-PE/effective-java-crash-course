package weekx.exception;

public class AbuseOfException {

	public static void main(String[] args) {
		int[] digets = new int[] { 1, 2, 3 };
		System.out.println(sum(digets));

	}

	// TODO change code ITEM 69
	public static int sum(int[] digets) {
		int result = 0;
		try {
			int i = 0;
			while (true) {
				result += digets[i++];
			}
		} catch (ArrayIndexOutOfBoundsException ignored) {
			// TODO: handle exception
		}

		return result;
	}

}
