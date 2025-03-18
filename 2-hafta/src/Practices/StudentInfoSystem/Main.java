package Practices.StudentInfoSystem;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Teacher[] teachers = new Teacher[5];

        Teacher mathTeacher = new Teacher("Ali", "Ak", "5553332211");
        Teacher physicsTeacher = new Teacher("Ayşe", "Sarı", "5553332211");
        Teacher chemTeacher = new Teacher("Fatma", "Beyaz", "5553332211");
        Teacher bioTeacher = new Teacher("Zeynep", "Kara", "5553332211");
        Teacher physicalEduTeacher = new Teacher("Ahmet", "Mavi", "5553332211");

        teachers[0] = mathTeacher;
        teachers[1] = physicsTeacher;
        teachers[2] = chemTeacher;
        teachers[3] = bioTeacher;
        teachers[4] = physicalEduTeacher;

        Course mathCourse = new Course("Matematik", "Mat101", 8);
        Course physicsCourse = new Course("Fizik", "Fzk101", 6);
        Course chemCourse = new Course("Kimya", "Kim101", 6);
        Course bioCourse = new Course("Biyoloji", "Bio101", 4);
        Course physicalEduCourse = new Course("Beden Eğitimi", "Bdn101", 2);

        mathCourse.setTeacher(mathTeacher);
        physicsCourse.setTeacher(physicsTeacher);
        chemCourse.setTeacher(chemTeacher);
        bioCourse.setTeacher(bioTeacher);
        physicalEduCourse.setTeacher(physicalEduTeacher);

        mathTeacher.setTeachCourse(mathCourse);
        physicsTeacher.setTeachCourse(physicsCourse);
        chemTeacher.setTeachCourse(chemCourse);
        bioTeacher.setTeachCourse(bioCourse);
        physicalEduTeacher.setTeachCourse(physicalEduCourse);

        Student[] students = new Student[4];

        Student student1 = new Student("Cem", "Dirman", LocalDate.of(2015,03, 23), 001);
        Student student2 = new Student("Emir", "Al", LocalDate.of(2015,04, 23), 002);
        Student student3 = new Student("Nehir", "Al", LocalDate.of(2015,05, 23), 003);
        Student student4 = new Student("Zeynep", "Kırmızı", LocalDate.of(2015, 06, 23), 004);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        Course[] courses = new Course[5];
        courses[0] = mathCourse;
        courses[1] = physicsCourse;
        courses[2] = chemCourse;
        courses[3] = bioCourse;
        courses[4] = physicalEduCourse;

        /*
        student1.setCourses(courses);
        student2.setCourses(courses);
        student3.setCourses(courses);
        student4.setCourses(courses);
        */

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        for (Course course : courses) {
            System.out.println(course);
        }

        for (Student student : students) {
            System.out.println(student);
        }

        student1.addCourse(mathCourse, 0);
        student1.addCourse(physicsCourse, 1);
        student1.addCourse(chemCourse, 2);
        student1.addCourse(bioCourse, 3);
        student1.addCourse(physicalEduCourse, 4);
        // student1.addCourse(physicalEduCourse,5); en fazla 5 ders eklenebildiği için yeni bir ders ekleyemezsin

        student2.addCourse(mathCourse, 0);
        student2.addCourse(physicsCourse, 1);
        student2.addCourse(chemCourse, 2);
        student2.addCourse(bioCourse, 3);

        student3.addCourse(mathCourse, 0);
        student3.addCourse(physicsCourse, 1);
        student3.addCourse(chemCourse, 2);
        student3.addCourse(bioCourse, 3);
        student3.addCourse(physicalEduCourse, 4);

        student4.addCourse(mathCourse, 0);
        student4.addCourse(physicsCourse, 1);
        student4.addCourse(chemCourse, 2);
        student4.addCourse(bioCourse, 3);
        student4.addCourse(physicalEduCourse, 4);

        student1.addNotes(mathCourse, 85);
        student1.addNotes(physicsCourse, 85);
        student1.addNotes(chemCourse, 85);
        student1.addNotes(bioCourse, 85);
        student1.addNotes(physicalEduCourse, 85);

        student2.addNotes(mathCourse, 25);
        student2.addNotes(physicsCourse, 25);
        student2.addNotes(chemCourse, 25);
        student2.addNotes(bioCourse, 25);
        student2.addNotes(physicalEduCourse, 25);

        student2.addNotes(mathCourse, 25);
        student2.addNotes(physicsCourse, 25);
        student2.addNotes(chemCourse, 25);
        student2.addNotes(bioCourse, 25);
        student2.addNotes(physicalEduCourse, 25);

        student3.addNotes(mathCourse, 25);
        student3.addNotes(physicsCourse, 25);
        student3.addNotes(chemCourse, 25);
        student3.addNotes(bioCourse, 25);
        student3.addNotes(physicalEduCourse, 25);

        student4.addNotes(mathCourse, 25);
        student4.addNotes(physicsCourse, 25);
        student4.addNotes(chemCourse, 25);
        student4.addNotes(bioCourse, 25);
        student4.addNotes(physicalEduCourse, 25);


        for (Student student : students) {
            for (Course course : student.getCourses()) {
                System.out.println(student.getName().toUpperCase() + " öğrencisi " + course.getName().toUpperCase() + " dersi için " + course.getNote() + " notunu almıştır.");
            }

        /*
        for( Course c1 : student1.getCourses()){
            System.out.println(student1.getName().toUpperCase() + " öğrencisi " + c1.getName().toUpperCase() + " dersi için " + c1.getNote() + " notunu almıştır.");
        }
        */

        }
    }
}
