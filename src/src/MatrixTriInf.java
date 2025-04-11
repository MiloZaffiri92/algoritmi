package src.src;

import java.util.Scanner;

public class MatrixTriInf {

    //Algoritmo che verifica che una matrice sia triangolare inferiore(tutti 0 nella parte superiore)
    //caricare la matrice e produrre la risposta con un messaggio
    //la matrice deve avere le stesse righe e colonne

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero di righe: ");
        int m = scanner.nextInt();
        System.out.print("inserisci il numero di colonne: ");
        int n = scanner.nextInt();

        //Inizializzo la matrice
        int [][] matrix = new int[m][n];

        if(m != n){
            System.out.println("la matrice deve avere le stesse righe e colonne");
            return;
        }

        //popolo la matrice
        int i = 0;

        while (i < matrix.length){
            int j = 0 ;
            while (j < matrix[0].length){
                System.out.println("inserisci elemento nella posizione " + i + " " + j);
                matrix[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        //verifico che la matrice sia triangolare inferiore
        boolean tri = true;

        i = 0;

        while (i < matrix.length && tri){
            int j = i + 1;
            while(j < matrix[0].length){
                if(matrix[i][j] != 0){
                    tri = false;
                    break;
                }
                j++;
            }
            i++;
        }


        if(tri){
            System.out.println("la matrice è tringolare inferiore");
        }else{
            System.out.println("la matrice non è triangolare inferiore");
        }
    }
}
