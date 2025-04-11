package src.src;

import java.util.Arrays;
import java.util.Scanner;

public class TwoMatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il numero di righe: ");
        int m = scanner.nextInt();
        System.out.println("inserisci il numero di colonne: ");
        int n = scanner.nextInt();


        //creazione matrici

        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[m][n];
        int[][] matrixC = new int[m][n];

        //popolamento della matriceA
        int i = 0;
        while(i < m){
            int j = 0;
            while(j < n){
                System.out.println("inserisci il valore nella posizione " + i + " " + j);
                matrixA[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        //popolamento della matriceB
        i = 0;
        while(i < m){
            int j = 0;
            while(j < n){
                System.out.println("inserisci il valore nella posizione " + i + " " + j);
                matrixB[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        //somma delle due matrici nella matriceC
        i = 0;
        while(i < m){
            int j = 0;
            while(j < n){
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                j++;
            }
            i++;
        }

        System.out.println("la somma delle matrici A e B è uguale: " + Arrays.deepToString(matrixC));

    }
}
