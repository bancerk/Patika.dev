package CanliDers1.multiDimensionalArrays;

public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        // 3x3 matris oluşturma
        int[][] matrix = new int[3][3];

        // Değer atama
        matrix[0][0] = 1;  // İlk satır, ilk sütun
        matrix[0][1] = 2;  // İlk satır, ikinci sütun
        matrix[0][2] = 3;  // İlk satır, üçüncü sütun

        matrix[1][0] = 4;  // İkinci satır, ilk sütun
        matrix[1][1] = 5;  // İkinci satır, ikinci sütun
        matrix[1][2] = 6;  // İkinci satır, üçüncü sütun

        matrix[2][0] = 7;  // Üçüncü satır, ilk sütun
        matrix[2][1] = 8;  // Üçüncü satır, ikinci sütun
        matrix[2][2] = 9;  // Üçüncü satır, üçüncü sütun

        // Matrisi ekrana yazdırma
        System.out.println("Matris içeriği:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Yeni satıra geç
        }
    }
}
