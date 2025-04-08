package src.algoritmi;

import java.util.Arrays;
import java.util.Scanner;

//Somma i valori di matrice A e matrice B e copia i valori in una matrice C

public class MatrixTwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero di righe matrice A: ");

        int n = scanner.nextInt();

        System.out.print("Inserisci il numero di colonne matrice A: ");

        int m = scanner.nextInt();

        System.out.print("Inserisci il numero di righe matrice B: ");

        int k = scanner.nextInt();

        System.out.print("Inserisci il numero di colonne matrice B: ");

        int l = scanner.nextInt();

        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[k][l];
        int[][] matrixC = new int[n][m];

        int i = 0;

        while(i<n){
            int j = 0;
            while (j<m){
                System.out.print("Inserisci il numero matrice A: ");
                matrixA[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        System.out.print("La matrice A è ");
        System.out.print(Arrays.deepToString(matrixA));
        i = 0;
        while(i<k){
            int j = 0;
            while (j<l){
                System.out.print("Inserisci il numero matrice B: ");
                matrixB[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        System.out.print("La matrice B è ");
        System.out.print(Arrays.deepToString(matrixB));

        i = 0;
        while(i<n){
            int j = 0;
            while(j<m){
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                j++;
            }
            i++;
        }
        System.out.print("La matrice C è ");
        System.out.print(Arrays.deepToString(matrixC));
    }

}
