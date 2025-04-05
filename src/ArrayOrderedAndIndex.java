import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrderedAndIndex {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int[] array = {1, 3, 5, 8};


            System.out.print("Inserisci un numero da inserire in ordine: ");
            int numero = scanner.nextInt();


            int[] nuovoArray = new int[array.length + 1];

            int i = 0;
            boolean inserito = false;
            int j = 0;

            while (i < array.length) {
                if (!inserito && numero < array[i]) {
                    nuovoArray[j] = numero;
                    inserito = true;
                    j++;
                }
                nuovoArray[j] = array[i];
                i++;
                j++;
            }
            if (!inserito) {
                nuovoArray[j] = numero;
            }
            System.out.println("Array originale: " + Arrays.toString(array));
            System.out.println("Array con numero inserito: " + Arrays.toString(nuovoArray));
        }
    }


