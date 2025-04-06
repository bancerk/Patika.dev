package odevler.records;

public record Student(String name, String surName, int studentNo) {
    @Override
    public String toString() {
        return "Name: " + name + ", " +
                "Surname: " + surName + ", " +
                "Student No: " + studentNo + " ";
    }
}
