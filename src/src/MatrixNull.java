package src.src;

import java.util.Scanner;

public class MatrixNull {
    //date due matrici A e B verificare che la loro somma sia uguale ad una matrice C nulla

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci il numero di righe: ");
        int m = scanner.nextInt();
        System.out.print("inserisci il numero di colonne: ");
        int n = scanner.nextInt();

        //inizializzo le matrici

        int [][] matrixA = new int[m][n];
        int [][] matrixB = new int[m][n];
        int [][] matrixC = new int[m][n];

        //popolo matrice A e B

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
        //sommo le matrici
        i = 0;
        while(i < m){
            int j = 0;
            while(j < n){
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                j++;
            }
            i++;
        }

        //adesso controllo se in ogni posizione della matrice c ci sia lo 0 (nullo)


        i = 0;
        boolean valid = true;

        while(i < m && valid){
            int j = 0;
            while(j < n && valid){
                if (matrixC[i][j] != 0){
                    valid = false;
                }
                j++;
            }
            i++;
        }

        if(valid){
            System.out.println(valid);
        }else{
            System.out.println(valid);
        }
    }
}
