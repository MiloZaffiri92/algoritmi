package src.src;

import java.util.Scanner;

public class ArrayValueSameIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci la grandezza dell'array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int i = 0;
        while(i < n) {
            System.out.println("inserisci il valore nella posizione "+i);
            arr[i] = scanner.nextInt();
            i++;
        }

        boolean uguali = true;

        i = 0;

        while(i < n && uguali) {
            if(arr[i] != i) {
                uguali = false;
            }
            i++;
        }

        if(uguali) {
            System.out.println("valori uguali per indice e numero");
        }else {
            System.out.println("valorin non uguali per indice e numero");
        }
    }
}
