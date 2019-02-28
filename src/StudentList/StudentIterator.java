package StudentList;
import List.Student;

import java.util.Iterator;

public class StudentIterator implements Iterator<Student> {

    private Node<Student> current;

    public StudentIterator(StudentList list) {
        this.current = list.getFirst();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Student next() {
        if (hasNext()) {
            Student result = current.getData();
            current = current.getNext();
            return result;
        }
        return null;
    }
}

