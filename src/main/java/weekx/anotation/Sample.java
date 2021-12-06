package weekx.anotation;

public class Sample {

	@MyAnotation({ "hoge", "fuga" })
	public static void myMethod1(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("myMethod1");
	}

	@MyAnotation({ "hoge", "fuga" })
	@MyAnotation({ "foo", "bar" })
	public static void myMethod2() {
		System.out.println("myMethod2");
	}

}
