package src.src;

import java.util.Scanner;

public class SymmetricalMatrix {
    public static void main(String[] args) {
        //data una matrice mxm verificare che sia simmetrica

        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci il numero di righe e colonne per la matrice: ");
        int m =scanner.nextInt();

        //inizializzo la matrice

        int[][] matrix = new int[m][m];
        //popolo la matrice

        int i = 0;
        while(i < m){
            int j = 0;
            while(j < m){
                System.out.println("inserisci il valore nella posizione "+ i + " " + j);
                matrix[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }


        //controllo se la matrice è simmetrica

        i = 0;
        boolean simmetrica = true;

        while(i < m && simmetrica){
            int j = 0;
            while(j < m && simmetrica){
                if(matrix[i][j] != matrix[j][i]){
                    simmetrica = false;
                }
                j++;
            }
            i++;
        }

        if(simmetrica){
            System.out.println("la matrice è simmetrica");
        }else{
            System.out.println("la matrice non è simmetrica");
        }
    }
}
