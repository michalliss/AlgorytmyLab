package StudentList;

import List.DataIterator;
import List.Node;
import List.Student;

import java.util.Iterator;

public class StudentList implements Iterable {

    private Node<Student> first;
    private int size;

    public StudentList() {
        first = new Node<>();
        size = 0;
    }

    public void add() {
        if (size == 0) {
            this.first = new Node<>();
            this.size = 1;

        } else {
            Node<Student> n = new Node(null, null);
            Node last = getNode(size - 1);
            last.setNext(n);
            this.size++;
        }
    }

    public void add(Student data) {
        if (size == 0) {
            this.first = new Node<Student>(data);
            this.size = 1;
        } else {
            Node<Student> n = new Node(null, data);
            Node last = getNode(size - 1);
            last.setNext(n);
            this.size++;
        }
    }

    public void insert(Student data, int index) {
        if (index <= size) {
            Node n = this.first;
            Node np = null;
            if (index == 0) {
                Node<Student> ins = new Node(n, data);
                this.first = ins;
            } else {
                for (int i = 0; i < index; i++) {
                    np = n;
                    n = n.getNext();
                }
                Node<Student> ins = new Node<Student>(n, data);
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

    public void remove(Student data) {
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

    public Node find(Student data) {
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

    public Node<Student> getFirst() {
        return first;
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public void setFirst(Node<Student> first) {
        this.first = first;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(this);
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

}
