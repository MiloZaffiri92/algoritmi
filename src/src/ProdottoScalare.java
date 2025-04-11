package src.src;

import java.util.Scanner;

public class ProdottoScalare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci grandezza del primo array: ");
        int n = scanner.nextInt();

        System.out.print("inserisci grandezza del secondo array: ");
        int m = scanner.nextInt();

        if(n!= m){
            System.out.println("la grandezza dei due array deve essere uguale ");
            return;
        }

        int[] arrA = new int[n];
        int[] arrB = new int[m];

        //popolo gli array

        int i = 0 ;
        while (i < n){
            System.out.println("inserisci il valore nella posizione " + i);
            arrA[i] = scanner.nextInt();
            i++;
        }

        i = 0;
        while (i < n){
            System.out.println("inserisci il valore nella posizione " + i);
            arrB[i] = scanner.nextInt();
            i++;
        }

        //effettuo il prodotto scalare tra due array

        int risultato = 0;
        i = 0;

        while(i < n){
            risultato = arrA[i]*arrB[i] +risultato;
            i++;
        }

        System.out.println("il prodotto scalare tra i due vettori è di " + risultato);
    }
}
