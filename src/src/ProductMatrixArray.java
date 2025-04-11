package src.src;

import java.util.Scanner;

public class ProductMatrixArray {

    // data una matrice A mxn e un Array arr di lunghezza n calcolare
    // l'arr arrP di dimensioni m risultante dal prodotto tra matrice A e array arr

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci il numero di righe: ");
        int m = scanner.nextInt();
        System.out.print("inserisci il numero di colonne: ");
        int n = scanner.nextInt();
        //inizializzo matrice e array

        int[][] matrixA = new int[m][n];

        int[] arr = new int[n];
        int[] arrP = new int[m];

        // popolo matrice e array
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
        while(i< n){
            System.out.println("inserisci il valore nella posizione: " +i);
            arr[i]= scanner.nextInt();
            i++;
        }

        i = 0;
        while(i < m){
            int somma = 0;
            int j = 0;
            while(j < n){
                somma = (matrixA[i][j]*arr[j]) +somma;
                arrP[i] = somma;
                j++;
            }
            i++;
        }

        i = 0;
        while(i < m){
            System.out.println("stampa valore nella posizione " + arrP[i]);
            i++;
        }
    }
}
