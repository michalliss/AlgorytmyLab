package List;

import java.util.Iterator;

public class DataList<E> implements Iterable<E> {
    private Node<E> first;
    private int size;

    public DataList() {
        first = new Node<>();
        size = 0;
    }

    public void add(E data) {
        if (size == 0) {
            this.first = new Node<E>(data);
            setSize(1);
        } else {
            Node<E> n = new Node(first, data);
            setSize(getSize() + 1);
            this.first = n;
        }
    }

    public void remove(E data) {
        Node n = this.first;
        Node np = null;
        while (n != null) {
            if (n.getData().equals(data)) {
                if (n == this.first) {
                    this.setFirst(n.getNext());
                    setSize(getSize() - 1);
                } else {
                    np.setNext(n.getNext());
                    setSize(getSize() - 1);
                }

            }
            np = n;
            n = n.getNext();
        }

    }

    public Node find(E data) {
        Node n = this.first;
        while (n != null) {
            if (n.getData().equals(data)) {
                return n;
            }
            n = n.getNext();
        }
        return null;
    }
    // TODO: 27/02/19 znajdowanie/usuwanie po numerze

    public void print() {
        Node n = first;
        while (n != null) {
            String a = new String();
            a = n.getData().toString();
            System.out.println(a);
            n = n.getNext();
        }
    }

    public Node<E> getFirst() {
        return first;
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public void setFirst(Node<E> first) {
        this.first = first;
    }

    @Override
    public Iterator<E> iterator() {
        return new DataIterator<E>(this);
    }


    /*
    @Override
    public Iterator<List.Node<E>> iterator() {
        Iterator<List.Node<E>> it = new Iterator<List.Node<E>>() {

            private List.Node<E> current = null;
            int nextIndex = 0;

            @Override
            public boolean hasNext() {
                return nextIndex < size;
            }

            @Override
            public List.Node<E> next() {
                if (current == null) {
                    current = first;
                }else{
                    current = current.getNext();
                }

                nextIndex++;
                return current;

            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

    */
}
