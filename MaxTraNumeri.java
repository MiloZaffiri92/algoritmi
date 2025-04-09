import java.util.Scanner;

public class MaxTraNumeri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi controllare? ");
        int quantita = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int i = 0;
        do {
            System.out.println("Inserisci i numeri: ");
            int numero = scanner.nextInt();
            if (numero > max) {
                max = numero;
            }
            i++;
        } while (i < quantita);

        System.out.println(max);
        scanner.close();
    }
}
