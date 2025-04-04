package Practices.studentInfoSystem;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {

    private String name;
    private String surname;
    private LocalDate birthDate;
    private Integer studentNo;
    private Course[] courses = new Course[5]; // max 5 ders alabilir

    public Student(String name, String surname, LocalDate birthDate, Integer studentNo) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.studentNo = studentNo;
    }

    public void addCourse (Course course,int index) {
            if (index>=0 && index<courses.length){
                courses[index] = course;
                System.out.println(course.getName() + " dersi başarılı olarak eklendi");
            }else {
                System.out.println("Maksimum ders sayısını aştınız! 5 ders ekleyebilirsiniz.");
            }
    }

    public void addNotes(Course course,int note){
        for (Course c1 : getCourses()) {
            if (c1.getName().equals(course.getName())) {
                c1.setNote(note);
                System.out.println(c1.getName() + " dersi için " + note + " notunu girdiniz.");
                break;
            } else {
                System.out.println("Bu öğrenci bu dersi almadığı için not girişi yapamazsınız.");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public Course[] getCourses() {
        return courses;
    }

    private void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", studentNo=" + studentNo +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
