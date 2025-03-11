package week2.session1.multiDimensionalArrays;

public class MatrixAddition {
    public static void main(String... args) {
        // İki matris tanımlama
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Sonuç matrisi için boş bir matris oluşturma
        int[][] resultMatrix = new int[3][3];

        // Matrisleri toplama
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Sonuç matrisini yazdırma
        System.out.println("Matris 1:");
        printMatrix(matrix1);

        System.out.println("\nMatris 2:");
        printMatrix(matrix2);

        System.out.println("\nToplam Matrisi:");
        printMatrix(resultMatrix);
    }

    // Matris yazdırma yardımcı metodu
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    /*public void kullaniciKaydi() {

        bilgileriDogrula();
        veriTabaninaKaydet();
        emailGonder();


    }*/


}
