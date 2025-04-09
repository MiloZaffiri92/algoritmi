// Inversione ordine degli elementi di un array

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static void FillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.println("Inserisci numero: ");
            array[i] = scanner.nextInt();
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci grandezza: ");
        int[] array = new int[scanner.nextInt()];
        FillArray(array);

        int i = 0;
        int temp;
        while(i < array.length/2 ) {
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-1-i] = temp;
            i += 1;
        }

        System.out.println(Arrays.toString(array));
        scanner.close();
    }
}
