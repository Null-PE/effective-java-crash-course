package week7;

import java.util.Collection;

// TODO　要素を追加された回数を返すgetAddCountという機能を持つHashSetを実装してください。(継承を使うこと）
public class InstrumentedHashSet_01ExtendedPattern<E> {

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
