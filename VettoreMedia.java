import java.util.Scanner;

// Calcolo del valore medio dei numeri interi contenuti in un vettore di dimensioni n.
public class VettoreMedia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Grandezza dell'array: ");
        int[] array = new int[scanner.nextInt()];
        int i = 0;
        do {
            System.out.println("Numero da inserire: ");
            array[i] = scanner.nextInt();
            i++;
        } while (i < array.length);

        i = 0;
        int somma = 0;
        while(i < array.length) {

            somma += array[i];
            i++;
        }

        System.out.println("Il valore medio del vettore è " + somma / array.length);

    }
}
