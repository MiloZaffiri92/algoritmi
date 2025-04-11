package src.src;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("definisci la lunghezza dell'array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int i = 0 ;

        do {
            System.out.println("inserisci il numero nella posizione " + i);
            arr[i] = scanner.nextInt();
            i++;
        }while(i<arr.length);

        int[] cArr = new int[n+1];

        i = 0;

        System.out.println("quale numero vuoi inserire? ");
        int numero = scanner.nextInt();


        while(i< arr.length && arr[i]<numero){
            cArr[i] = arr[i];
            i++;
        }

        cArr[i] = numero;

        while(i< arr.length){
            cArr[i+1] = arr[i];
            i++;
        }
        System.out.println("array senza numero inserito: " + Arrays.toString(arr));
        System.out.println("il nuovo con il numero inserito: " + Arrays.toString(cArr));
    }
}
