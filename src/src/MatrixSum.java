package src.src;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il numero di righe: ");
        int m = scanner.nextInt();
        System.out.println("inserisci il numero di colonne: ");
        int n = scanner.nextInt();

        //creazione matrice

        int[][] matrix = new int[m][n];

        //popolamento della matrice
        int i = 0;

        while(i < matrix.length){
            int j = 0;
            while(j < matrix[0].length){
                System.out.println("inserisci il numero nella posizione: "+ i + " " + j);
                matrix[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        System.out.println("matrice : " + Arrays.deepToString(matrix));


        //somma della matrice
        int somma = 0;
        i = 0;

        while(i < matrix.length){
            int j = 0;
            while(j < matrix[0].length){
                somma+= matrix[i][j];
                j++;
            }
            i++;
        }
        System.out.println("la somma della matrice è di: " + somma);
    }
}
