package src.src;

import java.util.Scanner;

public class MatriciUguali {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci la grandezza delle righe: ");
        int m = scanner.nextInt();
        System.out.print("inserisci il numero di colonne: ");
        int n = scanner.nextInt();


        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[m][n];

        int i = 0;

        while(i < m){
            int j = 0;
            while(j < n){
                System.out.println("inserisci il valore nella posizione " +i +" "+j);
                matrixA[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        i = 0;
        while(i < m){
            int j = 0;
            while(j < n){
                System.out.println("inserisci il valore nella posizione " +i +" "+j);
                matrixB[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        i = 0;

        boolean uguali = true;

        while(i < m && uguali){
            int j = 0;
            while(j < n && uguali){
                if(matrixA[i][j] != matrixB[i][j]){
                    uguali = false;
                }
                j++;
            }
            i++;
        }

        if(uguali){
            System.out.println("le matrici sono uguali");
        }else{
            System.out.println("le matrici non sono uguali");
        }

    }


}
