package src.src;

import java.util.Scanner;

public class ArrayEvenIndOddInd {
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
        i = 0;
        boolean valid = true;
        while(i < n && valid) {
            if(i % 2 == 0) {
                if(arr[i] % 2 !=0) {
                    valid = false;
                }
            }else {
                if(arr[i] % 2 == 0) {
                    valid= false;
                }
            }
            i++;
        }

        if(valid) {
            System.out.println("array valido");
        }else {
            System.out.println("array non valido");
        }
    }
}
