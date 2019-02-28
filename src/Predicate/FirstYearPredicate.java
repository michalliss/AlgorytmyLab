package Predicate;

import List.Student;

public class FirstYearPredicate<E> implements Predicate<E> {
    @Override
    public boolean isValid(E data) {
        if (data instanceof Student) {
            if (((Student) data).getRokStudiow() == 1)
                return true;
        }
        return false;
    }
}
