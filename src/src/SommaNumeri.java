package src.src;

import java.util.Scanner;

public class SommaNumeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somma = 0;
        int i = 0;

        do{
            System.out.println("inserisci numeri");
            somma = somma + scanner.nextInt();
            i++;
        }while(i<5);

        System.out.println("la somma è di " + somma);
    }
}
