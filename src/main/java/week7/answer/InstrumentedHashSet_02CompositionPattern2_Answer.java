package week7.answer;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InstrumentedHashSet_02CompositionPattern2_Answer<E> implements Set<E> {

	private int addCount = 0;

	private Set<E> innerSet = new HashSet<E>();

	@Override
	public boolean add(E e) {
		addCount++;
		return innerSet.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount = addCount + c.size();
		return innerSet.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

	@Override
	public int size() {
		return innerSet.size();
	}

	@Override
	public boolean isEmpty() {
		return innerSet.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return innerSet.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		return innerSet.iterator();
	}

	@Override
	public Object[] toArray() {
		return innerSet.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return innerSet.toArray(a);
	}

	@Override
	public boolean remove(Object o) {
		return innerSet.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return innerSet.containsAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return innerSet.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return innerSet.removeAll(c);
	}

	@Override
	public void clear() {
		innerSet.clear();
	}
}
