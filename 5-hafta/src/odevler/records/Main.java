package odevler.records;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create Student record instances
        Student student1 = new Student("John", "Smith", 1);
        Student student2 = new Student("Joseph", "Joestar", 2);
        Student student3 = new Student("Jonathan", "Joestar", 3);
        Student student4 = new Student("Dio", "Brando", 4);

        // Add all students to a list
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        // Print the list of students
        System.out.println(studentList);

        // Check if two student objects are equal
        System.out.println((student2.equals(student4) ? "student2 and student4 are same" : "student2 and student4 are NOT same"));
        System.out.println((student1.equals(student3) ? "student1 and student3 are same" : "student1 and student3 are NOT same"));

        // Print the hash codes of each student
        // Useful for testing the hashCode implementation in the Student record
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
    }
}