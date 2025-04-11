package src.src;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il numero delle righe: ");
        int n = scanner.nextInt();
        System.out.println("inserisci il numero di colonne: ");
        int m = scanner.nextInt();


        int[][] matrix = new int[n][m];
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<m){
                System.out.println("inserisci il numero nella posizione " + i + " " + j);
                matrix[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        System.out.println("la matrice contiene i seguenti valori: " + Arrays.deepToString(matrix));

    }
}
