// Package declaration for organizing related classes
package odevler.innerClass;

// Import statements for required Java classes
import java.util.ArrayList;
import java.util.List;

// Main class definition
public class Main {

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Creating Employee objects with different parameters
        Employee employee = new Employee("John", "Smith", "jsmith@patika.com", 123);
        Employee employee1 = new Employee("Joseph", "Joestar", "jjoestar@patika.com", 456);
        Employee employee2 = new Employee("Jonahthan", "Joestar", "jjoestar2@patika.com", 789);
        Employee employee3 = new Employee("Dio", "Brando", "dbrando@patika.com", 234);

        // Creating a List to store Employee objects
        List<Employee> employeeList = new ArrayList<>();

        // Adding Employee objects to the list
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        // Iterating through the employee list and printing each employee
        for (Employee employees : employeeList) {
            System.out.println(employees);
        }
    }
}