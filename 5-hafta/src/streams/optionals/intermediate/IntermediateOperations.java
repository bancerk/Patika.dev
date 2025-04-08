package streams.optionals.intermediate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperations {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();
        customerList.add((new Customer("Ali")));
        customerList.add((new Customer("Veli")));
        customerList.add((new Customer("Ayşe")));
        customerList.add((new Customer("Ayşe")));
        customerList.add((new Customer("Veli")));
        customerList.add((new Customer("Veli")));
        customerList.add((new Customer("Elif")));
        customerList.add((new Customer("Emir")));
        customerList.add((new Customer("Nehir")));

        // Klasik kullanım
        List<Customer> filteredCustomerList = new ArrayList<>();
        for(Customer customer : customerList){
            if (customer.getName().startsWith("A")){
                filteredCustomerList.add(customer);
            }
        }

        System.out.println("Foreach ile: " + filteredCustomerList);


        // Stream ile kullanım
        List<Customer> customerList1 = customerList.stream()
                .filter(customer -> customer.getName().startsWith("A"))
                .toList();

        System.out.println("Stream ile: " + customerList1);

        List<String> stringNames = customerList.stream()
                .map(customer -> customer.getName().toUpperCase())
                .toList();
        System.out.println(stringNames);
        // bir tipi başka bir tipe değiştirmek için map kullanıyoruz


        // distinct methodu
        List<String> names = customerList.stream()
                .map(customer -> customer.getName().toUpperCase())
                .distinct()
                .toList();
        System.out.println("names = " + names);


        List<String> sortedCustomers = customerList.stream()
                .sorted(Comparator.comparing(customer -> customer.getName()))
                .map(customer -> customer.getName())
                .toList();
        System.out.println("sortedCustomers = " + sortedCustomers);


        List<String> sortedCustomerList = customerList.stream()
                .sorted(Comparator.comparing(customer -> customer.getName()))
                .map(customer -> customer.getName())
                .distinct()
                .toList();
        System.out.println("sortedCustomerList = " + sortedCustomerList);

        List<String> reversedCustomers = sortedCustomers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("reversedCustomers = " + reversedCustomers);

        List<String> reversedCustomerList = sortedCustomers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();
        System.out.println("reversedCustomerList = " + reversedCustomerList);


        // Skip ve Limit methodları

        List<String> reversedCustomerLimitedList = sortedCustomers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .toList();
        System.out.println("reversedCustomerLimitedList = " + reversedCustomerLimitedList);


        List<String> strings = reversedCustomerList.stream()
                .skip(2)
                .toList();
        System.out.println("strings = " + strings);
    }
}
