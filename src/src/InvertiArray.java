package src.src;

import java.util.Arrays;
import java.util.Scanner;

public class InvertiArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci la grandezza dell'array: ");
        int n = scanner.nextInt();

        int[] arr = new int [n];

        int i = 0 ;
        do{
            System.out.println("inserisci il numero nella posizione " + i);
            arr[i] = scanner.nextInt();
            i++;
        }while(i<arr.length);

        System.out.println("array prima dell'inversione: " + Arrays.toString(arr));
        i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("array dopo l'inversione: " +Arrays.toString(arr));
    }
}
