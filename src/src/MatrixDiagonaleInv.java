package src.src;

import java.util.Scanner;

public class MatrixDiagonaleInv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il numero di righe: ");
        int m = scanner.nextInt();
        System.out.println("inserisci il numero di colonne: ");
        int n = scanner.nextInt();

        int[][] matrixInv = new int[m][n];



        //popolamento della diagonale inversa

        int l = matrixInv.length - 1;
        int i = 0;

        while(i < m){
            int j = 0;
            while(j < n){
                if(i + j == l){
                    matrixInv[i][j] = 1;
                }else{
                    matrixInv[i][j] = 0;
                }
                j++;
            }
            i++;
        }

        i = 0;
        while(i < n){
            int j = 0;
            while(j < m){
                System.out.print(matrixInv[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
