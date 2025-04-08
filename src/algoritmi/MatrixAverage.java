package src.algoritmi;

import java.util.Arrays;

//Trovare la media dei valori per ogni colonna di matrice.
//Leggere n ed m, caricare A[nxm]
//I valori delle medie devono essere caricati in un vettore B.
//Stampare il vettore
public class MatrixAverage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = matrix.length;
        int m = matrix[0].length;
        int[] array = new int[n];
        int j = 0;

        while(j<m){
            int sum = 0;

            int i = 0;
            while (i<n){
                sum += matrix[i][j];
                i++;
            }
            array[j] = sum/n;
            j++;
        }
        System.out.print(Arrays.toString(array));
    }
}
