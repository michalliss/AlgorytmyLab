package Predicate;

import List.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class OlderThan30Predicate<E> implements Predicate<E> {
    @Override
    public boolean isValid(E data) {
        if (data instanceof Student) {
            LocalDate birthdate = ((Student) data).getBirthdate();
            Period p = Period.between(birthdate, LocalDate.now());
            if (p.getYears() >= 18) {
                return true;
            }
        }
        return false;
    }
}
