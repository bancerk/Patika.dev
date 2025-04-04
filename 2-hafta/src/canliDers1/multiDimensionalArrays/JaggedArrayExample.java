package canliDers1.multiDimensionalArrays;

public class JaggedArrayExample {
    public static void main(String[] args) {
        // Düzensiz dizi tanımlama
        int[][] jaggedArray = new int[3][];

        // Her satır için farklı uzunlukta diziler oluşturma
        jaggedArray[0] = new int[3];  // İlk satır 3 elemanlı
        jaggedArray[1] = new int[5];  // İkinci satır 5 elemanlı
        jaggedArray[2] = new int[2];  // Üçüncü satır 2 elemanlı

        // Değer atama
        // İlk satır
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[0][2] = 3;

        // İkinci satır
        jaggedArray[1][0] = 10;
        jaggedArray[1][1] = 20;
        jaggedArray[1][2] = 30;
        jaggedArray[1][3] = 40;
        jaggedArray[1][4] = 50;

        // Üçüncü satır
        jaggedArray[2][0] = 100;
        jaggedArray[2][1] = 200;

        // Düzensiz diziyi yazdırma
        System.out.println("Düzensiz dizi içeriği:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Satır " + i + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Alternatif tanımlama ve değer atama
        int[][] jaggedArray2 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("\nİkinci düzensiz dizi içeriği:");
        for (int[] row : jaggedArray2) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

