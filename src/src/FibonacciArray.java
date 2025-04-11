package src.src;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci lunghezza array: ");
        int n = scanner.nextInt();

        int [] arrFib = new int[n];

        arrFib[0] = 0;
        arrFib[1] = 1;

        int i = 2;

        while (i < arrFib.length){

            arrFib[i] = arrFib[i-2] + arrFib[i-1];
            i++;
        }

        System.out.println("la sequenza di fibonacci è di: " + Arrays.toString(arrFib));
    }
}
