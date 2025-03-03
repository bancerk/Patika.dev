public class main {
    public static void main (String[] args) {

        int number = -5;
        
        if (number >= 5){

        // şart gerçekleşirse çalışacak

        System.out.println("sayı 5'ten büyük veya 5'e eşit");

        }

        else if (number < 0) {

            System.out.println("sayı 0'dan küçük");
        }

        else {

        // şart gerçekleşmezse çalışacak

        System.out.println("sayı 5'ten küçük");
        }

        if (number == 5){System.out.println("sayı 5'e eşit!");}

        else if (number != 5 && number > 5){System.out.println("sayı 5'ten büyük ve 5'e eşit değil");}





        int not = 85;
        String harfNotu;

        if (not>=85){harfNotu="A"};
        else if (not>=70){harfNotu="B"};
        else if (not>=60){harfNotu="C"};
        else {harfNotu="D"};

        System.out.println(harfNotu);
    }
}