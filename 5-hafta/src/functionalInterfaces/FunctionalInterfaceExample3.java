package functionalInterfaces;

public class FunctionalInterfaceExample3 {

    public static void main(String[] args) {

        Converter celciusToFahrenheit = celsius -> (celsius *1.8) + 32;

        celciusToFahrenheit.printConversion(25);
    }
}
