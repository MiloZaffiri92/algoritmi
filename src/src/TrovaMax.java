package src.src;

import java.util.Scanner;

public class TrovaMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci la grandezza dell'array: ");

        int n = scanner.nextInt();

        int[] arr = new int[n];
        int i = 0;
        while(i < n){
            System.out.println("inserisci il numero nella posizione " + i);
            arr[i] = scanner.nextInt();
            i++;
        }

        int max = arr[0];
        i = 1;

        while(i < arr.length){
            if(arr[i] > max){
                max = arr[i];
            }
            i++;
        }

        System.out.println("il numero massimo dell'array è " + max);
    }

}
