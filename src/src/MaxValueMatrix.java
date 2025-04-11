package src.src;

import java.util.Scanner;

public class MaxValueMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci la grandezza delle righe: ");
        int m = scanner.nextInt();
        System.out.print("inserisci la grandezza delle colonne: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        int i = 0;

        while(i < m) {
            int j = 0;
            while(j < n) {
                System.out.println("insersci il valore nella posizione: "+i+" "+j);
                matrix[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        i = 0;

        int max = matrix[0][0];
        int posR = 0;
        int posC = 0;


        while(i < m) {
            int j = 1;
            while(j < n) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                    posR = i;
                    posC = j;
                }
                j++;
            }
            i++;
        }

        System.out.println("l'elemento maggiore della matrice è: "+max+ " e si trova nella posizione: "+posR+ " "+posC);
    }
}
