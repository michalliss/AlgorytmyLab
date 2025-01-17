package List;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private LocalDate birthdate;
    private String nr;
    private int rokStudiow;
    private double sredniaOcen;

    public Student(String name, String surname, LocalDate birthdate, String nr, int rokStudiow, double sredniaOcen) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.nr = nr;
        this.rokStudiow = rokStudiow;
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public String toString() {
        return "List.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", nr='" + nr + '\'' +
                ", rokStudiow=" + rokStudiow +
                ", sredniaOcen=" + sredniaOcen +
                '}';
    }

    public String CSVtoString() {
        return name + "," + surname + "," + birthdate + "," + nr + "," + rokStudiow + "," + sredniaOcen;
    }

    public static Student parseStudent(String s) {
        String[] values = s.split(",");
        String name = values[0];
        String surname = values[1];
        LocalDate birthdate = LocalDate.parse(values[2]);
        String nr = values[3];
        int rokStudiow = Integer.parseInt(values[4]);
        double sredniaOcen = Double.parseDouble(values[5]);
        Student student = new Student(name, surname, birthdate, nr, rokStudiow, sredniaOcen);
        return student;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getNr() {
        return nr;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public void setSredniaOcen(int sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }
}
