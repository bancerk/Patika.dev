package canliDers.streamApi;

public class University {
    private String university;
    private String department;
    private int numberOfStudents;
    private int gpa;

    public University(String university, String department, int numberOfStudents, int gpa) {
        this.university = university;
        this.department = department;
        this.numberOfStudents = numberOfStudents;
        this.gpa = gpa;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "University{" +
                "university='" + university + '\'' +
                ", department='" + department + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", gpa=" + gpa +
                '}';
    }
}
