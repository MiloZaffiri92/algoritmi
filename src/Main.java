package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ex1();
        Ex2();
        Ex3();
        Ex4();
    }
    private static void Ex1() {
        int array[] = {120, 23, 4, 0, 1};
        int somma = 0;
        for (int i = 0; i < array.length; i++) {
            somma = somma + array[i];
        }
        System.out.println("La somma dei valori dell'array è " + somma);
    }

    private static void Ex2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci il numero di valori presenti nell'array: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        int sommaArray = 0;
        System.out.println("Inserisci i valori dell'array:");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
            sommaArray = array[i] + sommaArray;
        }

        int a = 0, b = 1, sommaFibonacci = 0;

        for (int i = 0; i < n; i++) {
            sommaFibonacci += a;
            int temp = a + b;
            a = b;
            b = temp;
        }

        int sommaTotale = sommaArray + sommaFibonacci;

        System.out.println("Somma dei valori dell'array: " + sommaArray);
        System.out.println("Somma dei primi " + n + " numeri di Fibonacci: " + sommaFibonacci);
        System.out.println("Somma totale: " + sommaTotale);

        scan.close();

    }

    private static void Ex3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci quanti valori ha l'array: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        boolean trov = false;
        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci il valore numero " + (i + 1) + " all'interno dell'array: ");
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    trov = true;
                    break;
                }
            }
        }
        if (trov) {
            System.out.println("Ci sono numeri ripetuti all'interno dell'array");
        } else {
            System.out.println("Non ci sono numeri ripetuti all'interno dell'array");
        }
        scan.close();
    }

    private static void Ex4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci il numero di valori presenti all'interno dell'array: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        boolean uguale = true;
        for (int i = 0; i < n; i++) {
            System.out.println("inserisci il valore numero " + (i + 1) + " dell'array: ");
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] != (i + 1)) {
                uguale = false;
                break;
            }
        }
        if (uguale) {
            System.out.println("I valori sono uguali al loro indice");
        } else {
            System.out.println("I valori non sono uguali al loro indice");
        }

    }

}