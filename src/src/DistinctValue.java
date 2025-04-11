package src.src;

import java.util.Scanner;

public class DistinctValue {
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

        boolean dist = true;
        i = 0;

        while(i < n && dist) {
            int j = i+1;

            while(j < n && dist) {
                if(arr[i] == arr[j]) {
                    dist = false;
                }
                j++;
            }
            i++;
        }

        if(dist) {
            System.out.println("non ci sono elementi ripetuti");
        }else {
            System.out.println("ci sono elementi ripetuti");
        }

    }
}
