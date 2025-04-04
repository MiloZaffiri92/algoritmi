import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        algoritmo_4();

    }

    private static void algoritmo_1 () {
        //somma di tutti i numeri contenuti in un array
        int[] array = {4, 6, 7, 5};
        int somma=0;
        int i=0;
        while(i<array.length){
            somma+=array[i];
            i++;
        }
        System.out.println("La somma dei numeri degli array è: " + somma);
    }

    private static void algoritmo_2 () {
        //data n=7 riempi l'array con la sequenza di fibonacci

        int [] array = new int[7];
        array[0]=1;
        array[1]=2;
        int i=2;
        while(i<array.length) {
            array[i]=array[i-1]+array[i-2];
            System.out.println(array[i]);
            i++;
        }

    }

    private static void algoritmo_3 () {
        //Dato un array determina se ci sono valori ripetuti
        //caricamento array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dell'array");
        int n = scanner.nextInt();
        int f=0;
        int[] array = new int[n];
        while(f<n) {
            System.out.println("Inserisci un numero: " );
            array[f]=scanner.nextInt();
            f++;
        }

        int i=0;
        boolean rip=false;
        if (n>1) {
            while (i<array.length && !rip) {
                int j=i+1;
                while (j<array.length && array[i]!=array[j]) {
                    j++;
                }
                if (j!=array.length) rip=true;
                i++;
            }

        }

        if(rip) System.out.println("Ci sono valori ripetuti");
        else System.out.println("Non ci sono valori ripetuti");


    }
}

