package week1;

import week1.domain.value.Product;

public class ProductApp {

	public static void main(String[] args) {

		Product product = new Product();

		// Objectを継承することで利用できるメソッド
		System.out.println("product.getClass():" + product.getClass());
		System.out.println("product.toString():" + product.toString());
		// == と equalsの違いは何か
		System.out.println(product.equals(new Product()));
		System.out.println("product.hashCode():" + product.hashCode());

		// 以下はマルチスレッドプログラミングの際に利用するので今回は省略
		// product.notify(); notifyAll()
		// product.wati();
		// wait notifyは非同期プログラミングに利用する。

	}

}
