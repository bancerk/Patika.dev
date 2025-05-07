package week9.varargs;

public class Varargs02 {
    public static void main(String[] args) {
       printMessages("Mesaajlar","Merhaba","Nasılsın","Java");
    }

    static void printMessages(String prefix, String... messages){
        System.out.println(prefix + ": ");
        for (String msg : messages){
            System.out.println("- "+msg);
        }
    }
}
