package src.src;

import java.util.Scanner;

public class MatrixAvgColumn {

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

        int j = 0;
        double sommaCol = 0;
        double avgCol = 0;

        double [] arrAvg = new double[n];

        while(j < n) {

            while(i < m) {
                sommaCol = matrix[i][j] +sommaCol;
                i++;
            }
            avgCol = (double)sommaCol/m;// media = somma / il numero degli elementi della colonna
            arrAvg[j] = avgCol;
            j++;
            i = 0;
            sommaCol = 0;


        }
        i = 0;
        while(i < n) {
            System.out.println(arrAvg[i]);
            i++;
        }
    }
}
