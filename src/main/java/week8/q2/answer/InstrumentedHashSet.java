package week8.q2.answer;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstrumentedHashSet<E> extends ForwardingSet<E> implements Set<E> {

	private int addCount = 0;

	public InstrumentedHashSet() {
		super(new HashSet<E>());
	}

	public InstrumentedHashSet(HashSet<E> set) {
		super(set);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount = addCount + c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

}
