import java.util.Arrays;
import java.util.Scanner;

public class NewNumArray {
//    Algoritmo che, dato un vettore contenente valori interi ordinati in senso crescente, inserisca un nuovo intero in posizione ordinata
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserisci la dimensione n: ");
    int n = scanner.nextInt();
    int[] array = new int[n + 1];

    System.out.println("Inserisci " + n + "numeri ordinati in senso crescente: ");
    int i = 0;
    while(i < n) {
        array[i] = scanner.nextInt();
        i++;
    }

    System.out.println("Inserisci un numero intero da inserire: ");
    int x = scanner.nextInt();

    i = n-1;
    while (i >= 0 && array[i] > x) {
        array[i+1] = array[i];
        i--;
    }
    array[i+1] = x;

    System.out.println(Arrays.toString(array));

}
}
