package week1;

import week1.domain.value.Product;

public class ProductApp {

	public static void main(String[] args) {

		Product product = new Product();

		// オーバーライド不要
		// クラス名を出力、リフレクションなどで利用する
		System.out.println("product.getClass():" + product.getClass());
		
		// オーバーライドが必要なもの
		// フィールド名と値を文字列としてつなげて文字列として返すもの
		System.out.println("product.toString():" + product.toString());
		// オブジェクトの等価性をチェックするメソッド
		// オブジェクト型の == は参照値が同じかを確認している
		System.out.println(product.equals(new Product()));
		// HashMap,HashSetクラスを利用するために独自実装が必要
		System.out.println("product.hashCode():" + product.hashCode());

		// 以下はマルチスレッドプログラミングの際に利用するので今回は省略
		// product.notify(); notifyAll()
		// product.wati();
		// wait notifyは非同期プログラミングに利用する。

	}

}
