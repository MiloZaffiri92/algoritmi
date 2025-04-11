package src.src;

import java.util.Scanner;

public class ArrayPowOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci la grandezza dell'array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int i = 1;
        arr[0] = 1;

        while(i < n) {
            arr[i] = arr[i-1]*2;
            i++;
        }

        i = 0;
        while(i<n) {
            System.out.println(arr[i]);
            i++;
        }
    }
}
