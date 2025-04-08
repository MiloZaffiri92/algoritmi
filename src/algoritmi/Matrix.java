package src.algoritmi;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci righe: ");
        int n = scanner.nextInt();
        System.out.println("Inserisci colonne: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        int i = 0;



        do{
            int j = 0;
            do{
                System.out.println("Inserisci numero: ");
                matrix[i][j] = scanner.nextInt();
                j++;
            }while(j < m);
            i++;
        }while(i < n);
        System.out.print("La matrice è: " + Arrays.deepToString(matrix));


    }
}
