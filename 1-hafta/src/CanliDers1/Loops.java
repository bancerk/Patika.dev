package CanliDers1;

public class Loops {

    public static void main(String[] args) {

        for(int i = 0; i<10; i++){
            if (i == 5){
                continue; // i = 5 iterasyonunu atlar
            }
            System.out.println(i);

        }

        int i = 0;
        while (i < 10) {

            System.out.println(i);
            i++;
        }

        i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i < 10);

// do ilk adıma her zaman girer, iterasyonlar devam ettikçe while koşulu sağlamayan iterasyona gelene kadar çalışır.
// while koşulu hatalı olsa dahi en az bir defa çalışır.

// loopları iç içe kullanabilirsin

        for(int i = 0; i<10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println(i + " - " + j); // 10 x 20 = 200 defa çalışır
            }
        }
    }

}
