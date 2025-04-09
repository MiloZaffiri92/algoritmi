import java.util.Scanner;

/* Verificare se un numero è presente in un vettore di dimensione n.
*  Leggere n, caricare il vettore e stampare il messaggio "è presente" o "non è presente"*/
public class VettoreNumDaTrovare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Grandezza dell'array: ");
        int[] array = new int[scanner.nextInt()];
        int i = 0;
        do {
            System.out.println("Numero da inserire: ");
            array[i] = scanner.nextInt();
            i++;
        }while (i < array.length);

        System.out.println("Decidi il numero da trovare: ");

        int valore = scanner.nextInt();
        boolean trovato = false;

        i = 0;
        while (i < array.length && !trovato) {

            if (array[i] == valore) {
                trovato = true;
            }
            i++;
        }

        if (trovato) {
            System.out.println("Il numero è presente");
        } else {
            System.out.println("Il numero non è presente");
        }

        scanner.close();
    }
}
