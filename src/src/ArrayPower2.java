package src.src;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPower2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci la grandezza dell'array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        //popolo array
        int i = 0;

        while (i < arr.length){
            System.out.println("inserisci il numero nella posizione " + i);

            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.println("array prima del suo quadrato: " + Arrays.toString(arr));

        //per elemento dell'array fare il quadrato
        i = 0;
        while(i < arr.length){
            //arr[i] = (int) Math.pow(arr[i],2);
            arr[i] = arr[i]*arr[i];
            i++;
        }

        System.out.println("Array dopo il suo quadrato: " + Arrays.toString(arr));

    }
}
