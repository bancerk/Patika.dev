package streams.optionals.intermediate;

import Practices.studentInfoSystem.Course;

import java.util.List;

public class Student {

    private final String name;
    private final List<Course> courses;

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", courses=" + courses + '}';
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}
