package src.algoritmi;

import java.util.Scanner;

public class SommaNumeri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somma = 0;
        int i = 0;
        System.out.println("Inserisci numero: ");

        while (i<5) {
            int numero = scanner.nextInt();
            somma += numero;
            i +=1;
        };
        System.out.println("la somma è" + somma);

    }
}


