import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //algortimo che vuoi testare da 1-10
        algoritmo_10();

    }

    private static void algoritmo_1() {
        //somma di tutti i numeri contenuti in un array
        int[] array = {4, 6, 7, 5};
        int somma = 0;
        int i = 0;
        while (i < array.length) {
            somma += array[i];
            i++;
        }
        System.out.println("La somma dei numeri degli array è: " + somma);
    }

    private static void algoritmo_2() {
        //data n=7 riempi l'array con la sequenza di fibonacci

        int[] array = new int[7];
        array[0] = 1;
        array[1] = 2;
        int i = 2;
        while (i < array.length) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.println(array[i]);
            i++;
        }

    }

    private static void algoritmo_3() {
        //Dato un array determina se ci sono valori ripetuti
        //caricamento array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dell'array");
        int n = scanner.nextInt();
        int f = 0;
        int[] array = new int[n];
        while (f < n) {
            System.out.println("Inserisci un numero: ");
            array[f] = scanner.nextInt();
            f++;
        }

        int i = 0;
        boolean rip = false;
        if (n > 1) {
            while (i < array.length && !rip) {
                int j = i + 1;
                while (j < array.length && array[i] != array[j]) {
                    j++;
                }
                if (j != array.length) rip = true;
                i++;
            }

        }

        if (rip) System.out.println("Ci sono valori ripetuti");
        else System.out.println("Non ci sono valori ripetuti");


    }

    private static void algoritmo_4() {
        // Dato un vettore determina se ogni valore dell'aray corrisponde al valore del suo indice
        //caricamento vettore
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dell'array");
        int[] ar = new int[scanner.nextInt()];
        int f = 0;
        while (f < ar.length) {
            System.out.println("Inserisci un numero: ");
            ar[f] = scanner.nextInt();
            f++;
        }

        //corpo esercizio
        int i = 0;
        while (i < ar.length && i == ar[i]) i++;
        if (i == ar.length) System.out.println("Ogni valore corrisponde al suo indice");
        else System.out.println("Ogni valore non corrisponde al suo indice");
    }

    private static void algoritmo_5() {
        //Dato un array determina se ogni indice pari contiene un numero pari e viceversa per gli indici dispari
        //caricamento vettore
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dell'array");
        int[] ar = new int[scanner.nextInt()];
        int f = 0;
        while (f < ar.length) {
            System.out.println("Inserisci un numero: ");
            ar[f] = scanner.nextInt();
            f++;
        }

        int i = 0;
        while (i < ar.length && (i % 2 == 0 && ar[i] % 2 == 0 || i % 2 == 1 && ar[i] % 2 == 1)) i++;
        if (i == ar.length) System.out.println("Condizione rispettata");
        else System.out.println("Condizione non rispettata");
    }

    private static void algoritmo_6() {
        //data la dimensione di un array riempilo con le prime n potenze di 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la dimensione dell'array");
        int n = scanner.nextInt();
        if (n > 0) {
            int[] ar = new int[n];
            ar[0] = 1;
            int i = 1;
            System.out.println("2 ^ 0 = " + ar[0]);
            while (i < n) {
                ar[i] = ar[i - 1] * 2;
                System.out.println("2 ^ " + i + " = " + ar[i]);
                i++;

            }
        }
    }

    private static void algoritmo_7() {
        //dato un array di dimensione n determina se l'array è palindromo;

        //caricamento vettore
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dell'array");
        int[] ar = new int[scanner.nextInt()];
        int f = 0;
        while (f < ar.length) {
            System.out.println("Inserisci un numero: ");
            ar[f] = scanner.nextInt();
            f++;
        }

        int i = 0;
        while (i < ar.length / 2 && ar[i] == ar[ar.length - i - 1]) i++;
        if (i == ar.length / 2) System.out.println("L'array è palindromo");
        else System.out.println("L'array non è palindromo");
    }

    private static void algoritmo_8() {
        //dato un array determina se ci sono caratteri ripetuti
        //caricamento vettore
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dell'array");
        char[] ar = new char[scanner.nextInt()];
        int f = 0;
        while (f < ar.length) {
            System.out.println("Inserisci un carattere: ");
            ar[f] = scanner.next().charAt(0);                     //usato charAt(0) prende solo la prima posizione di cio che inseriamo e la trasforma in char
            f++;
        }

        int i=0;
        boolean rip=false;
        if (ar.length>2) {
            do {
                int j=i+1;
                while ( j<ar.length && ar[j]!=ar[i]) j++;
                i++;
                if(j!=ar.length) rip=true;
            } while (i<ar.length-1 && !rip);
        }

        if (rip) System.out.println("Ci sono caratteri ripetuti");
        else System.out.println("Non ci sono caratteri ripetuti");
    }

    private static void algoritmo_9() {
        //Dato un array ordinato in ordine crescente determina se ci sono numeri ripetuti nel caso in cui stampa a video quali e quanti
            //caricamento vettore con controllo inserimento solo numeri crescenti
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dell'array");
        int[] ar = new int[scanner.nextInt()];
        int f=0;
        while (f<ar.length) {
            System.out.println("Inserisci un numero: ");
            ar[f]=scanner.nextInt();
            while (f!=0 && ar[f]<ar[f-1]) {
                System.out.println("Hai inserito un numero minore del precendente, l'array deve essere crescente \n Inserisci un altro valore ");
                ar[f]=scanner.nextInt();
            }
            f++;
        }

        //corpo algoritmo
        int i=0;
        int k=0;
        int[] ar2 = new int[ar.length/2];       //inserisco i numeri ripetuti
        int[] ar3 = new int[ar.length/2];       //nella stessa posizione di ar2 inserisco quante vole sono ripetuti
        while (i<ar.length-1) {
            int j=i+1;
            while (j<ar.length && ar[j]==ar[i]) j++;
            if(j-i>1) {
                ar2[k]=ar[i];
                ar3[k]=j-i-1;
                k++;
            }
            i=j;

        }

        //stampa risultati
        i=0;
        int totRip=0;
        while (i<k) {
            System.out.println(ar2[i]+" è un numero ripetuto \n Si ripete: "+ar3[i]+" volte");
            totRip+=ar3[i];
            i++;
        }
        System.out.println("In totale ci sono "+totRip+" ripetizioni");


    }

    private static void algoritmo_10() {
        //Dati due array crea un terzo array che contiene il loro prodotto scalare
        //caricamento vettore
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la grandezza del primo array");
        int[] ar = new int[scanner.nextInt()];
        int f=0;
        while (f<ar.length) {
            System.out.println("Inserisci un numero: ");
            ar[f]=scanner.nextInt();
            f++;
        }

        //caricamento vettore
        System.out.println("Inserisci la grandezza del secondo array");
        int[] ar2 = new int[scanner.nextInt()];
        f=0;
        while (f<ar2.length) {
            System.out.println("Inserisci un numero: ");
            ar2[f]=scanner.nextInt();
            f++;
        }

        if (ar.length==ar2.length) {
            int prodottoScalare=0;
            int [] ar3 = new int[ar.length];
            int i=0;
            while (i<ar.length) {
                ar3[i]=ar[i]*ar2[i];
                prodottoScalare+=ar3[i];
                i++;
            }
            System.out.println("Il prodotto scalare è " + prodottoScalare );
        }
        else System.out.println("Il prodotto scalare non si può fare in quanto gli array sono di dimensioni diverse");
    }



}