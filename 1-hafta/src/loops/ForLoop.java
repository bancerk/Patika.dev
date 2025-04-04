package loops;

public class ForLoop {

    public static void main(String[] args) {

        /*
        Loop çeşitleri:
        for
        foreach
        while
        do-while
         */

        int sum = 0;

        for (int i = 0; i < 100; i++) {

            System.out.println(i);

            sum = sum + i;

        }

        System.out.println("Toplam: " + sum);

        /* for loop koşullarını parçalı halde belirtebilirsin:

        int sum = 0;

        int i = 0; // loop başlangıcı

        for (; i < 100;) { // loop koşulu

            System.out.println(i);

            sum = sum + i;
            i++; // loop sonu

        }

        System.out.println("Toplam: " + sum);

        */

        int result = 0;

        for (int j = 0; j <= 1000; j++){ // j++; j = j+1;

            if (j % 5 == 0){

                System.out.println(j);
                // result = result + j;
                result += j;
                // j++ = j+1;
            }

        }
        System.out.println("5'e bölünen sayıların toplamı: " + result);
    }
}
