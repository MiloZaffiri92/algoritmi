package src.algoritmi;

import java.util.Arrays;
import java.util.Scanner;

//Inserisci 1 nella diagonale inversa di una matrice

public class MatrixDiagInsertInverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci righe: ");
        int n = scanner.nextInt();
        System.out.println("Inserisci colonne: ");
        int m = scanner.nextInt();
        int i = 0;

        int[][] matrix = new int[n][m];
        while(i< n){
            int j = 0;
            while (j< m){
                System.out.print("Inserisci il numero: ");
                matrix[i][j]= scanner.nextInt();
                j++;
            }
            i++;
        }
        i = 0;

        while (i<n){
            int j = 0;
            while (j<m){
                matrix[i][n-1-i] = 1;
                j++;
            }
            i++;
        }

        System.out.print(Arrays.deepToString(matrix));
    }
}
