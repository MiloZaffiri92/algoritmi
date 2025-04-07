import java.util.Arrays;
import java.util.Scanner;

public class NoRepeatedArray {
//    Algoritmo che, dato un vettore di numeri interi possibilmente ripetuti, costruisca un altro vettore senza valori ripetuti
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Definisci la grandezza dell'array: ");
    int n = scanner.nextInt();
    int[] array = new int[n];

    System.out.println("Popola l'array con numeri ripetuti in senso crescente: ");
    int i = 0;
    while(i < array.length) {
        array[i] = scanner.nextInt();
        i++;
    }

    int[] arrayB = new int[n];
    int repeatCount = 0;

    i = 0;
    while(i < n) {
        int x = array[i];
        boolean present = false;
        int j = 0;
        while(j < repeatCount) {
            if(arrayB[j] == x) {
                present = true;
                break;
            }
            j++;
        }
        if(!present) {
            arrayB[repeatCount] = x;
            repeatCount++;
        }
        i++;
    }
    System.out.println(Arrays.toString(arrayB));
}
}
