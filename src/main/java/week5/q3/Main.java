package week5.q3;

public class Main {

	public static void main(String[] args) {

		System.out.println(UniqueNumberGeneratorSingleton.getInstance().generate());
		System.out.println(UniqueNumberGeneratorSingleton.getInstance().generate());
		
		System.out.println(UniqueNumberGeneratorSingletonEnum.INSTANCE.generate());
		System.out.println(UniqueNumberGeneratorSingletonEnum.INSTANCE.generate());
		


	}

}
