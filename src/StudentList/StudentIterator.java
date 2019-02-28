package StudentList;

import List.DataList;
import List.Node;
import List.Student;

import java.util.Iterator;

public class StudentIterator {


import java.util.Iterator;

    public class DataIterator implements Iterator {

        private Node<Student> current;

        public DataIterator(DataList<Student> list) {
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

}
