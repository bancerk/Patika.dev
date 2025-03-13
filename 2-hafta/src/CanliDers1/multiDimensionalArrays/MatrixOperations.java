package CanliDers1.multiDimensionalArrays;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Matrisi for döngüsü ile işleme
        System.out.println("\"\\Standart for döngüsü ile:\"");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Gelişmiş for döngüsü (for-each) ile işleme
        System.out.println("\nFor-each döngüsü ile:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }

        // Matris elemanlarının toplamını bulma
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }
        System.out.println("\nMatris elemanlarının toplamı: " + sum);
    }
}
