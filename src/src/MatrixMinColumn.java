package src.src;

import java.util.Scanner;

public class MatrixMinColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci il numero di righe: ");
        int m = scanner.nextInt();
        System.out.print("inserisci il numero di colonne: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        //popolo la matrice

        int i = 0;

        while(i < m){
            int j = 0;
            while(j < n){
                System.out.println("inserisci il valore nella posizione "+i+" "+j);
                matrix[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        //inizializzo array con la lunghezza delle colonne

        int[] arrMin = new int[n];

        int j = 0;

        //scorro ogni colonna della matrice e inserisco il minimo nell'array

        while (j < n){
            i = 1;
            //metto nell'array il primo elemento della prima colonna
            arrMin[j] = matrix[0][j];
            while(i < m){
                if(matrix[i][j] < arrMin[j]){
                    arrMin[j] = matrix[i][j];
                }
                i++;
            }
            j++;
        }


        //stampo array  con i valori minimi di ogni colonna

        j = 0;

        while(j < arrMin.length){
            System.out.println("i valori minimi di ogni colonna sono: " + arrMin[j]);
            j++;
        }
    }
}
