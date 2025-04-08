package src.algoritmi;

import java.util.Arrays;
import java.util.Scanner;

// Inserisci 1 nella diagonale principale di una matrice

public class MatrixDiagInsert {
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
            while (j< n){
                if(j==i){
                    matrix[i][j]=1;
                    j++;
                }else{
                    j++;
                }
            }
            i++;
        }
        System.out.print(Arrays.deepToString( matrix));
    }
}
