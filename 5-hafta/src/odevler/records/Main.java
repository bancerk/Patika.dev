package odevler.records;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", "Smith", 1);
        Student student2 = new Student("Joseph", "Joestar", 2);
        Student student3 = new Student("Jonathan", "Joestar", 3);
        Student student4 = new Student("Dio", "Brando", 4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println(studentList);
    }
}
