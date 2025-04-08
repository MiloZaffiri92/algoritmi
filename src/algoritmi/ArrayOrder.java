package src.algoritmi;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Determina la grandezza dell'array: ");
        n = scanner.nextInt();
        int i = 0;
        int temp = 0;
        int[] array = new int[n];
        do {
            System.out.println("Inserisci un numero: ");
            array[i] = scanner.nextInt();
            i++;
        } while(i < array.length);
        i = 0;
        do {

            int j = 0;
            do {
                if(array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j +1];
                    array[j + 1] = temp;
                    j++;
                } else {
                    j++;
                }

            } while(j < array.length - 1 - i);
            i++;
        } while(i < array.length);
        System.out.println(Arrays.toString(array));
    }

}
