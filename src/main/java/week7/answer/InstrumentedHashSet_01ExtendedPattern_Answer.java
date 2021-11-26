package week7.answer;

import java.util.Collection;
import java.util.HashSet;

// TODO　要素を追加された回数を返すgetAddCountという機能を持つHashSetを実装してください。(継承を使うこと）
public class InstrumentedHashSet_01ExtendedPattern_Answer<E> extends HashSet<E> {

	private int addCount = 0;

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		//addCount++; <-これをやると不具合になる
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

}
