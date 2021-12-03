package week8.q1;

// TODO 1 implement this class and pass AbstractDisplayTest
// 参考　Java言語で学ぶデザインパターン https://www.hyuki.com/dp/
// テンプレートメソッドのメリット:saソース重複排除＋新規実装しやすい＋サブクラスを同一視できる（使う側はAbstractDisplayとして利用できる）
// JDKの参考クラスは
// java.io.InputStream#read(byte b[], int off, int len)がテンプレートメソッド
// java.io.OutputStream#write(byte b[], int off, int len)がテンプレートメソッド
public abstract class AbstractDisplay {

	public final String createDisplayString() {
		return null;
	}

}
