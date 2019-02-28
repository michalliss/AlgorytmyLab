package List;

import java.util.Iterator;

public class DataIterator<E> implements Iterator<E> {

    private Node<E> current;

    public DataIterator(DataList<E> list) {
        this.current = list.getFirst();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public E next() {
        if (hasNext()) {
            E result = current.getData();
            current = current.getNext();
            return result;
        }
        return null;
    }
}
