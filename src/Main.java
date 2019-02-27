import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("michal", "liss", new Date(1999, 5, 21), "246693", 1, 4.5);
        Student s2 = new Student("tomasz", "kek", new Date(1998, 5, 21), "", 2, 4);
        Student s3 = new Student("marcin", "zimny", new Date(1999, 2, 21), "", 4, 3);
        Student s4 = new Student("dawidek", "dawidek", new Date(2000, 1, 27), "", 1, 3.5);
    }
}
