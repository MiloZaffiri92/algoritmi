package src.src;

import java.util.Scanner;

public class MatrixOneFirstColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci il numero di righe: ");
        int m = scanner.nextInt();
        System.out.print("inserisci il numero di colonne: ");
        int n = scanner.nextInt();

        //inizializzo la matrice

        int[][] matrix = new int[m][n];

        //popolo la matrice

        int i = 0;
        while (i < m){
            int j = 0;
            while (j < n){
                System.out.println("inserisci elemento nella posizione " + i + " " + j);
                matrix[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        //controlo se nella prima colonna è popolata solo da uno

        boolean valid1 = true;

        i = 0;
        while(i < m && valid1){
            if(matrix[i][0] != 1){
                valid1 = false;
            }
            i++;
        }
        //se valid1 è true
        if(valid1){
            boolean valid0 = true;
            i = 0;
            while(i < m && valid0){
                //metto j = 1 dato che abbiamo già controllato che nella prima colonna ci sono 1
                int j = 1;
                while (j < n && valid0){
                    if(matrix[i][j] != 0){
                        valid0 = false;
                    }
                    j++;
                }
                i++;
            }
            if(valid0){
                System.out.println("la matrice è composta da 1 nella prima colonna e 0 altrove");
            }else{
                System.out.println("la matrice è composta da 1 nella prima colonna ma nelle altre parti compare un numero diverso da 0");
            }
        }else {
            System.out.println("nella prima colonna ci sono numeri diversi da 1");
        }
    }
}
