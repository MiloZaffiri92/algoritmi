package src;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        algoritmo1();
        algoritmo2();
        algoritmo3();
        algoritmo4();
    }

    public static void algoritmo1() {

        //Trova il minimo in una serie di numeri

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int num1 = scan.nextInt();
        System.out.println("Inserisci un secondo numero");
        int num2 = scan.nextInt();
        int numbasso = 0;
        if (num1 > num2) {
            System.out.println("il numero " + num2 + " è minore di " + num1);
            numbasso = num2;
        } else {
            System.out.println("il numero " + num1 + " è minore di " + num2);
            numbasso = num1;
        }
        System.out.println("Inserisci un terzo numero");
        int num3 = scan.nextInt();
        if (num3 > numbasso) {
            System.out.println("Il numero minore della sequenza è " + numbasso);
        } else {
            System.out.println("Il numero minore della sequenza è " + num3);
        }
    }

    public static void algoritmo2() {

        //Fai la media di valori in una serie di numeri

        Scanner scan = new Scanner(System.in);
        System.out.println("Fai la media in un insieme di numeri");
        System.out.println("Inserisci un numero");
        int num1 = scan.nextInt();
        System.out.println("Inserisci un secondo numero");
        int num2 = scan.nextInt();
        System.out.println("Inserisci un secondo numero");
        int num3 = scan.nextInt();
        int somma = num1 + num2 + num3;
        double media = (double) somma / 3;
        System.out.println("La media dei 3 numeri è: " + media);
    }

    private static void algoritmo3() {

        //Riempire array con i primi n numeri della sequenza di fibonacci

        Scanner scan=new Scanner(System.in);
        System.out.println("Inserisci la grandezza del vettore");
        int n=scan.nextInt();
        int i=2;
        int[] V = new int[n];
        V[i-2]=0;
        V[i-1]=1;
        while(i<n)
        {
            V[i]=V[i-2]+V[i-1];
            i++;
        }
        i=0;
        while(i<n)
        {
            System.out.println(V[i]);
            i++;
        }
    }

    public static void algoritmo4() {

        // Trova la quantità di numeri piu piccoli di un numero "x" in un insieme di numeri "n"

        Scanner scan = new Scanner(System.in);
        System.out.println("Determina la grandezza dell'insieme di numeri");
        int n = scan.nextInt();
        int i = 0;
        int numV;
        int[] array =new int[n];
        while (i < n) {
            System.out.println("Inserisci il numero all'interno del vettore");
            numV = scan.nextInt();
            array[i] = numV;
            i++;
        }
        System.out.println("Quale numero vuoi confrontare?");
        int numero = scan.nextInt();
        int minore = 0;
        i = 0;
        while (i < n) {
            if (array[i] < numero) {
                minore = minore + 1;
            }
            i++;
        }
        System.out.println("I numeri nel vettore minori di " + numero + " sono " + minore);
    }
}
