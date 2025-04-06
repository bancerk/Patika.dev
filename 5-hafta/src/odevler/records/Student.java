package odevler.records;

// Java record to represent an immutable Student object
// Records automatically generate constructor, getters, equals(), hashCode(), and toString()
public record Student(String name, String surName, int studentNo) {

    // Custom toString() method to provide a formatted string representation of the student
    @Override
    public String toString() {
        return "Name: " + name + ", " +
                "Surname: " + surName + ", " +
                "Student No: " + studentNo + " ";
    }
}