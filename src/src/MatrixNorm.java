package src.src;

import java.util.Scanner;

public class MatrixNorm {
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
        int sommaQuadrata = 0;

        while(i < m) {
            int j = 0;
            while(j < n) {
                sommaQuadrata = matrix[i][j]*matrix[i][j] + sommaQuadrata;
                j++;
            }
            i++;
        }

        double risultato = Math.sqrt(sommaQuadrata);

        System.out.println(risultato);
    }
}
