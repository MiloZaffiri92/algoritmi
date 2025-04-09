import java.util.Scanner;

public class Somma5Numeri {
    // Somma di numeri
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somma = 0;
        int i = 0;
        do {
            System.out.println("Inserisci un numero: ");
            somma += scanner.nextInt();
            i++;
        } while(i < 5);

        System.out.println("La somma dei 5 numeri è :" + somma);
        scanner.close();
    }
}
