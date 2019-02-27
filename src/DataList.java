public class DataList<E> {
    private Node<E> first;
    private int size;

    public DataList() {
        first = new Node<>();
        size = 1;
    }

    public void add(E data) {
        Node n = new Node<E>(first, data);
        size++;
        this.first = n;
    }

    public void remove(E data) {
        Node n = this.first;
        Node np = null;
        while (n != null) {
            if(n.getData().equals(data))
            {
                np.setNext(n.getNext());
                setSize(getSize()-1);
            }
            np = n;
            n = n.getNext();
        }

    }

    public Node find(E data){
        Node n = this.first;
        while(n != null){
            if(n.getData().equals(data))
            {
                return n;
            }
        }
        return null;
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
