package src.algoritmi;

import java.util.Arrays;
import java.util.Scanner;

//Inserisci 0 nella matrice a parte nella diagonale principale dove va inserito 1
public class MatrixInsertZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci righe: ");
        int n = scanner.nextInt();
        System.out.println("Inserisci colonne: ");
        int m = scanner.nextInt();
        int i = 0;

        int[][] matrix = new int[n][m];


        while(i<n){
            int j = 0;
            while(j<m){
                if(i == j){
                    matrix[i][j] = 1;
                    j++;
                }else{
                    matrix[i][j] = 0;
                    j++;
                }
            }
            i++;
        }

        System.out.print(Arrays.deepToString(matrix));

    }
}
