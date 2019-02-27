import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date birthdate;
    private String nr;
    private int rokStudiow;
    private double sredniaOcen;

    public Student(String name, String surname, Date birthdate, String nr, int rokStudiow, double sredniaOcen) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.nr = nr;
        this.rokStudiow = rokStudiow;
        this.sredniaOcen = sredniaOcen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(Date birthdate) {
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
