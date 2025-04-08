package src.algoritmi;

import java.util.Arrays;
import java.util.Scanner;

//Stampa somma di tutti gli elementi di una matrice
public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci righe: ");
        int n = scanner.nextInt();
        System.out.println("Inserisci colonne: ");
        int m = scanner.nextInt();
        int i = 0;

        int[][] matrix = new int[n][m];

        do{
            int j = 0;
            do{
                System.out.println("Inserisci numero: ");
                matrix[i][j] = scanner.nextInt();
                j++;
            }while(j < m);
            i++;
        }while(i < n);
        i = 0;
        int sum = 0;
       while (i < n){
           int j = 0;
           while (j < m){
               sum += matrix[i][j];
               j++;
           }
           i++;
       }
        System.out.println("La matrice è: ");
        System.out.print(Arrays.deepToString(matrix));
        System.out.print("La somma della matrice è: " + sum);

    }


}
