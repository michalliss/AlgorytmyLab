package List;

import StudentList.Node;

import java.util.Iterator;
 /*
//public class DataList<E> implements Iterable<E> {

    private Node<E> first;
    private int size;

    public DataList() {
        first = new Node<>();
        size = 0;
    }

    public void add() {
        if (size == 0) {
            this.first = new Node<>();
            this.size = 1;
        } else {
            Node<E> n = new Node(null, null);
            Node last = getNode(size - 1);
            last.setNext(n);
            this.size++;
        }
    }

    public void add(E data) {
        if (size == 0) {
            this.first = new Node<E>(data);
            this.size = 1;
        } else {
            Node<E> n = new Node(null, data);
            Node last = getNode(size - 1);
            last.setNext(n);
            this.size++;
        }
    }

    public void insert(E data, int index) {
        if (index <= size) {
            Node n = this.first;
            Node np = null;
            if (index == 0) {
                Node<E> ins = new Node(n, data);
                this.first = ins;
            } else {
                for (int i = 0; i < index; i++) {
                    np = n;
                    n = n.getNext();
                }
                Node<E> ins = new Node<E>(n, data);
                np.setNext(ins);
            }
            this.size++;
        } else {
            int oldSize = this.size;
            for (int i = 0; i < index - oldSize; i++) {
                this.add();
            }
            this.add(data);
            this.size++;
        }
    }

    public void remove(E data) {
        Node n = this.first;
        Node np = null;
        while (n != null) {
            if (n.getData().equals(data)) {
                if (n == this.first) {
                    this.setFirst(n.getNext());
                } else {
                    np.setNext(n.getNext());
                }
                size--;
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

    public Node getNode(int index) {
        Node n = this.first;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n;
    }
    // TODO: 27/02/19 znajdowanie/usuwanie po numerze

    public void print() {
        Node n = first;
        while (n != null) {
            String a = new String();
            if (n.getData() != null) {
                a = n.getData().toString();
                System.out.println(a);
            } else {
                System.out.println("-");
            }

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



    @Override
    public Iterator<StudentList.Node<E>> iterator() {
        Iterator<StudentList.Node<E>> it = new Iterator<StudentList.Node<E>>() {

            private StudentList.Node<E> current = null;
            int nextIndex = 0;

            @Override
            public boolean hasNext() {
                return nextIndex < size;
            }

            @Override
            public StudentList.Node<E> next() {
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


}
  */