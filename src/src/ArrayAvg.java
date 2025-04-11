package src.src;

import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci la grandezza dell'array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int i = 0;
        int somma = 0;

        while(i < n) {
            System.out.println("inserisci il valore nella posizione: "+i);
            arr[i] = scanner.nextInt();
            somma = arr[i] + somma;
            i++;
        }

        System.out.println("la somma è di: "+somma);


        double media = 0;

        media = (double) somma / n;

        System.out.print("la media è di: " +media);
    }
}
