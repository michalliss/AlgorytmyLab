package StudentList;

import Predicate.Predicate;

import java.util.Iterator;

public class FilteredIterator<E> implements Iterator<E> {
    private Iterator<E> iterator;
    private E current;
    private boolean hasNext;
    private Predicate<E> predicate;


    public FilteredIterator(Iterator<E> iterator, Predicate predicate) {
        super();
        this.iterator = iterator;
        this.predicate = predicate;
        findNextValid();
    }

    private E findNextValid() {
        E old = current;
        while (iterator.hasNext()) {
            E o = iterator.next();
            if (predicate.isValid(o)) {
                hasNext = true;
                current = o;

                return old;
            }
        }
        hasNext = false;
        return old;
    }

    @Override
    public boolean hasNext() {
        return hasNext;
    }

    @Override
    public E next() {
        if (hasNext()) {
            return findNextValid();
        }
        return null;
    }
}
