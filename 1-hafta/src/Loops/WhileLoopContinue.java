package Loops;

public class WhileLoopContinue {

    public static void main(String[] args) {

        int i = 0;

        int sum = 0;

        while(i < 25) {

            if (i % 5 == 0) {

                System.out.println(i + " değeri hesaba dahil değil");

                i++;

                continue; // else koymaya gerek yok, ifade sağlandığında continue ile while loop devam edecek.
            }
            System.out.println(i + " : değeri");
            sum += i;
            i++;
        }

        System.out.println("Toplam = " + sum);
    }
}
