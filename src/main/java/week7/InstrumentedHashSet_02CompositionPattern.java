package week7;

import java.util.Collection;

//TODO 要素を追加された回数を返すgetAddCountという機能を持つHashSetを実装してください。(継承を使わないこと）
public class InstrumentedHashSet_02CompositionPattern<E> {

	private int addCount = 0;

	public boolean add(E e) {
		return false;
	}

	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	public int getAddCount() {
		return addCount;
	}
}
