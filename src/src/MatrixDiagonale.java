package src.src;

import java.util.Scanner;

public class MatrixDiagonale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il numero di righe: ");
        int m = scanner.nextInt();

        System.out.println("inserisci il numero di colonne: ");
        int n = scanner.nextInt();

        int [][] matrix = new int[m][n];
        //inserisco gli 1 nella diagonale principale e 0 nelle altre posizioni

        int i = 0;
        while(i < m){
            int j = 0;
            while(j < n){
                if (i == j){
                    matrix[i][j] = 1;
                }else {
                    matrix[i][j] = 0;
                }
                j++;
            }
            i++;
        }

        //System.out.println("matrice: " + Arrays.deepToString(matrix));
        //stampo la matrice con il ciclo
        i = 0;
        while(i < n){
            int j = 0;
            while(j < m){
                System.out.print(matrix[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
