import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Determina la grandezza dell'array: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        int i = 0;
        int somma = 0;
        do{
            System.out.println("Inserisci un numero: ");
            array[i] = scanner.nextInt();
            somma = somma + array[i];
            i++;
        } while (i < array.length);
        System.out.println(somma);
    }
}
