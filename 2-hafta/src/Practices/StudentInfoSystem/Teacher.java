package Practices.StudentInfoSystem;

public class Teacher {
    private String teachName;
    private String teachSurname;
    private String teachPhone;
    private Course teachCourse;

    public Teacher(String teachName, String teachSurname, String teachPhone) {
        this.teachName = teachName;
        this.teachSurname = teachSurname;
        this.teachPhone = teachPhone;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    public String getTeachSurname() {
        return teachSurname;
    }

    public void setTeachSurname(String teachSurname) {
        this.teachSurname = teachSurname;
    }

    public String getTeachPhone() {
        return teachPhone;
    }

    public void setTeachPhone(String teachPhone) {
        this.teachPhone = teachPhone;
    }

    public Course getTeachCourse() {
        return teachCourse;
    }

    public void setTeachCourse(Course teachCourse) {
        this.teachCourse = teachCourse;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teachName='" + teachName + '\'' +
                ", teachSurname='" + teachSurname + '\'' +
                ", teachPhone='" + teachPhone + '\'' +
                ", teachCourse=" + teachCourse +
                '}';
    }
}
