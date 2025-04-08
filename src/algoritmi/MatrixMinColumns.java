package src.algoritmi;
//Trova il minimo per ogni colonna di una matrice
//Memorizza i risultati in un array monodimensionale
//Leggi le dimensioni n ed m e carica la matrice M[nxm]
//Stampa il vettore dei minimi


import java.util.Arrays;

public class MatrixMinColumns {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {2, 1, 7}
        };
        int n = matrix.length;
        int m = matrix[0].length;
        int[] array = new int[m];

        int j = 0;
        while (j < m) {
            array[j] = matrix[0][j];
            int i = 1;
            while (i < n) {
                if (matrix[i][j] < array[j]) {
                    array[j] = matrix[i][j];
                }
                i++;
            }
            j++;
        }
        System.out.print(Arrays.toString(array));
    }
}
