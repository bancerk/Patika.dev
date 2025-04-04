// Package declaration for organizing related classes
package odevler.innerClass;

// Employee class definition
public class Employee {

    // Private fields for employee information
    private String name;
    private String surName;
    private ContactInfo contactInfo;  // Using inner class for contact information

    // Constructor to initialize Employee object
    public Employee(String name, String surName, String email, int gsm) {
        this.name = name;
        this.surName = surName;
        // Creating ContactInfo object using the inner class
        this.contactInfo = new ContactInfo(email, gsm);
    }

    // Getter method for employee name
    public String getName() {
        return name;
    }

    // Overridden toString method to provide formatted employee information
    @Override
    public String toString() {
        return "\n" +
                "Employee Name: " + name + " " + surName + "\n" +
                contactInfo.toString();
    }

    // Static inner class for contact information
    public static class ContactInfo {
        // Fields for contact details
        private String email;
        private int gsm;

        // Constructor for ContactInfo
        public ContactInfo(String email, int gsm) {
            this.email = email;
            this.gsm = gsm;
        }

        // Overridden toString method for formatted contact information
        @Override
        public String toString() {
            return "Contact Information: " + "\n" +
                    "Email: " + email + "\n" +
                    "GSM: " + gsm + "\n";
        }
    }
}