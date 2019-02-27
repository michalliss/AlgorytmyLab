import java.util.Date;

public class Program {

    public static void run() {
        Student s1 = new Student("michal", "liss", new Date(1999, 5, 21), "246693", 1, 4.5);
        Student s2 = new Student("tomasz", "kek", new Date(1998, 5, 21), "", 2, 4);
        Student s3 = new Student("marcin", "zimny", new Date(1999, 2, 21), "", 4, 3);
        Student s4 = new Student("dawidek", "dawidek", new Date(2000, 1, 27), "", 1, 3.5);

        DataList<Student> studentList = new DataList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        studentList.print();
    }

}
