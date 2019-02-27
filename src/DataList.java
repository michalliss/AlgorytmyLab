import java.util.ArrayList;

public class DataList<E> {
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
                np.setNext(n.getNext());
                setSize(getSize() - 1);
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
        }
        return null;
    }

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

    public void setSize(int size) {
        this.size = size;
    }
}
