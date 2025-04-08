package src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Algoritmi su Array
        algoritmo_01(); // 01 - Dato un Array V=[120,23,4,0,1] somma tutti i numeri nell'array.
        algoritmo_02(); // 02 - Dato un Array V di dimensione n, dove n = 7, riempi l'array con i primi numeri della sequenza di fibonacci
        algoritmo_03(); // 03 - Dato V=[1,1,2,1,2,0,2] determina se ci sono numeri ripetuti
        algoritmo_04(); // 04 - Dato V=[1,2,3,4,5,6,7] determina se ogni valore dell'array corrisponde al suo indice
        algoritmo_05(); // 05 - Dato un array V determina se ogni indice pari contiene un numero pari e se ogni indice dispari contiene un numero dispari - dove 0==pari; Dove V=[0,1,2,3,4,5,6,7], V=[1,2,3,4,5,6,7,8], V=[0], V=[]
        algoritmo_06(); // 06 - Dato un Array di dimensione n riempi l'array con le prime n potenze di 2 (n=10)
        algoritmo_07(); // 07 - Dato un Array di dimensione n determina se l'Array è palindromo - ex:[1,2,1], [1], [1,1], [1,2,3,2,1], [1,2,2,1]
        algoritmo_08(); // 08 - Dato un Array V=[1,2,b,2,1,0,f,1,1,f,a] determina se ci sono caratteri ripetuti
        algoritmo_09(); // 09 - Dato un Array ordinato in ordine crescente V=[1,3,3,4,4,4,6,6,6,6] determina se ci sono numeri ripetuti, nel caso in cui stampa a video quali e quanti
        algoritmo_10(); // 10 - Dati due Array V=[2,4,8,16] e V2=[3,6,9,12] crea un terzo Array V3 che contiene il prodotto scalare dei due Array.

        // Algoritmi su Matrici
        matrici_01(); // M01 - Somma i valori contenuti in una matrice M di dimensione nxm e stampa a video
        matrici_02(); // M02 - Trova il massimo valore contenuto in una matrice M di dimensione nxm (Matrice quadrata)

        // Algoritmo del compito corretto in aula
        compito_01(); // Inserisci un numero in un vettore ordinato in ordine crescente

        // Esercizio 2025_04_08
        esercizio_2025_04_08_A(); // Dato un array di interi ed una target sum trova gli indici dei due numeri che sommati risultano essere il target (fermarsi appena si trova la coppia)
    }

    // 01 - Dato un Array V=[120,23,4,0,1] somma tutti i numeri nell'array.
    private static void algoritmo_01() {

        System.out.println("----------------------------------  Esercizio 01 ----------------------------------");
        System.out.println("01 - Dato un Array V=[120,23,4,0,1] somma tutti i numeri nell'array.");
        System.out.println("");

        int[] v = {120,23,4,0,1};
        int i = 0;
        int somma = 0;

        System.out.println("V = " + Arrays.toString(v));

        while (i < v.length) {
            System.out.println("Iterazione " + i + " : " + somma + " + " + v[i]);
            somma = somma + v[i];
            i++;
        }

        System.out.println("Somma: " + somma);
        System.out.println("-----------------------------------------------------------------------------------");

    }

    // 02 - Dato un Array V di dimensione n, dove n = 7, riempi l'array con i primi numeri della sequenza di fibonacci
    private static void algoritmo_02() {

        System.out.println("----------------------------------  Esercizio 02 ----------------------------------");
        System.out.println("02 - Dato un Array V di dimensione n, dove n = 7, riempi l'array con i primi numeri della sequenza di fibonacci");
        System.out.println("");

        int max_iterazioni = 7;
        int num_01 = 0;
        int num_02 = 1;
        int num_03;
        int i = 0;

        while (i < max_iterazioni){
            num_03 = num_01 + num_02;
            System.out.println(num_03);
            num_01 = num_02;
            num_02 = num_03;
            i++;
        }

        System.out.println("-----------------------------------------------------------------------------------");

    }

    // 03 - Dato V=[1,1,2,1,2,0,2] determina se ci sono numeri ripetuti
    private static void algoritmo_03() {

        System.out.println("----------------------------------  Esercizio 03 ----------------------------------");
        System.out.println("03 - Dato V=[1,1,2,1,2,0,2] determina se ci sono numeri ripetuti");
        System.out.println("");

        int[] v = {1,1,2,1,2,0,2};
        int n = v.length;
        int i = 0;
        int j = 0;
        boolean numeri_ripetuti = false;

        while (i < v.length){
            while (j < v.length){
                if (i != j){
                    if (v[i] == v[j]){
                        numeri_ripetuti = true;
                    }
                }
                j++;
            }
            i++;
        }

        if (numeri_ripetuti) {
            System.out.println("> C'è almeno un numero ripetuto");
        } else {
            System.out.println("> Non ci sono numeri rieptuti");
        }
        System.out.println("-----------------------------------------------------------------------------------");

    }

    // 04 - Dato V=[1,2,3,4,5,6,7] determina se ogni valore dell'array corrisponde al suo indice
    private static void algoritmo_04() {
        System.out.println("----------------------------------  Esercizio 04 ----------------------------------");
        System.out.println("04 - Dato V=[1,2,3,4,5,6,7] determina se ogni valore dell'array corrisponde al suo indice");
        System.out.println("");

        int[] v = {1,2,3,4,5,6,7};
        int i = 0;
        boolean almeno_uno_non_corrisponde = false;

        while (i < v.length && almeno_uno_non_corrisponde == false){
            if (v[i] != i){
                almeno_uno_non_corrisponde = true;
            }
        }

        if (almeno_uno_non_corrisponde) {
            System.out.println("> Non tutti i numeri corrispondono all'indice");
        } else {
            System.out.println("> Tutti i numeri corrispondono all'indice");
        }

        System.out.println("-----------------------------------------------------------------------------------");

    }

    // 05 - Dato un array V determina se ogni indice pari contiene un numero pari e se ogni indice dispari contiene un numero dispari
    // dove 0==pari; Dove V=[0,1,2,3,4,5,6,7], V=[1,2,3,4,5,6,7,8], V=[0], V=[]
    private static void algoritmo_05() {
        System.out.println("----------------------------------  Esercizio 05 ----------------------------------");
        System.out.println("05 - Dato un array V determina se ogni indice pari contiene un numero pari e se ogni indice dispari contiene un numero dispari");
        System.out.println("");

        int[] v = {0,1,2,3,4,5,6,7};
        int i = 0;
        boolean tutti_pari = true;
        boolean tutti_dispari = true;

        System.out.println("V = " + Arrays.toString(v));

        while (i < v.length && tutti_pari && tutti_dispari){
            if (i % 2 != 0){
                if (v[i] % 2 != 0){
                  tutti_pari = false;
                }
            } else {
                if (v[i] % 2 == 0){
                    tutti_dispari = false;
                }
            }
        }

        if (tutti_pari) {
            System.out.println("> Tutti gli indici pari sono pari");
        } else {
            System.out.println("> Almeno un indice pari non è pari");
        }

        if (tutti_dispari) {
            System.out.println("> Tutti gli indici dispari sono dispari");
        } else {
            System.out.println("> Almeno un indice dispari non è dispari");
        }

        System.out.println("-----------------------------------------------------------------------------------");

    }

    // 06 - Dato un Array di dimensione n riempi l'array con le prime n potenze di 2 (n=10)
    private static void algoritmo_06() {
        System.out.println("----------------------------------  Esercizio 06 ----------------------------------");
        System.out.println("06 - Dato un Array di dimensione n riempi l'array con le prime n potenze di 2 (n=10)");
        System.out.println("");

        int n = 10;
        int[] v = new int[n];
        int i = 0;

        while (i < n){
            v[i] = 2 << i;
            i++;
        }

        System.out.println("V = " + Arrays.toString(v));

        System.out.println("-----------------------------------------------------------------------------------");

    }

    // 07 - Dato un Array di dimensione n determina se l'Array è palindromo - ex:[1,2,1], [1], [1,1], [1,2,3,2,1], [1,2,2,1]
    private static void algoritmo_07() {
        System.out.println("----------------------------------  Esercizio 07 ----------------------------------");
        System.out.println("07 - Dato un Array di dimensione n determina se l'Array è palindromo - ex:[1,2,1], [1], [1,1], [1,2,3,2,1], [1,2,2,1]");
        System.out.println("");

        int[] v = {1,2,1};
        int i = 0;
        int j = v.length-1;
        boolean is_palindromo = true;

        System.out.println("V = " + Arrays.toString(v));

        while (i < v.length && is_palindromo){
            if (v[i] != v[j]){
                is_palindromo = false;
            }
            i++;
            j--;
        }

        if (is_palindromo){
            System.out.println("> E' palindromo");
        } else {
            System.out.println("> Non è palindromo");
        }

        System.out.println("-----------------------------------------------------------------------------------");

    }

    // 08 - Dato un Array V=[1,2,b,2,1,0,f,1,1,f,a] determina se ci sono caratteri ripetuti
    private static void algoritmo_08() {

        System.out.println("----------------------------------  Esercizio 08 ----------------------------------");
        System.out.println("08 - Dato un Array V=[1,2,b,2,1,0,f,1,1,f,a] determina se ci sono caratteri ripetuti");
        System.out.println("");

        Object[] v = {1,2,"b",2,1,0,"f",1,1,"f","a"};
        int n = v.length;
        int i = 0;
        int j = 0;
        boolean caratteri_ripetuti = false;

        System.out.println("V = " + Arrays.toString(v));

        while (i < v.length){
            while (j < v.length){
                if (i != j){
                    if (v[i] == v[j]){
                        caratteri_ripetuti = true;
                    }
                }
                j++;
            }
            i++;
        }

        if (caratteri_ripetuti) {
            System.out.println("> C'è almeno un carattere ripetuto");
        } else {
            System.out.println("> Non ci sono carattere rieptuti");
        }
        System.out.println("-----------------------------------------------------------------------------------");


    }

    // 09 - Dato un Array ordinato in ordine crescente V=[1,3,3,4,4,4,6,6,6,6] determina se ci sono numeri ripetuti, nel caso in cui stampa a video quali e quanti
    private static void algoritmo_09() {

        System.out.println("----------------------------------  Esercizio 09 ----------------------------------");
        System.out.println("09 - Dato un Array ordinato in ordine crescente V=[1,3,3,4,4,4,6,6,6,6] determina se ci sono numeri ripetuti, nel caso in cui stampa a video quali e quanti");
        System.out.println("");

        //int[] v = {1,1,1,1,1,1,1,1,1,};
        //int[] v = {1,3,3,3,3,3};
        int[] v = {1,3,3,4,4,4,6,6,6,6};
        int n = v.length;
        int[] vquali = new int[n/2];
        int[] vquanti = new int[n/2];
        int i = 0;
        int j = i+1;
        int k = 0;

        System.out.println("V = " + Arrays.toString(v));

        while (i < n-1 && j < n){
            //System.out.println("" + i + " - " + j );
            if (v[j] == v[i]){
                vquanti[k] = vquanti[k] + 1;
                vquali[k] = v[i];
                j++;

            } else{
                i = j;
                j = i + 1;
                if (vquanti[k] != 0){
                    k++; // La k aumenta solo se il numero appena analizzato è ripetuto almeno una volta (altrimenti rimanevano spazi in vquali e vquanti)
                }
            }
        }

        System.out.println("");
        System.out.println("Quali = " + Arrays.toString(vquali));
        System.out.println("Quanti = " + Arrays.toString(vquanti));

        // solo per stampare i numeri in modo ordinato
        k = 0;
        while (k < vquali.length){
            if (vquanti[k] != 0) {
                System.out.println("> Il numero '" + vquali[k] + "' è presente " + (vquanti[k]+1) + " volte e si ripete " + vquanti[k] + " volte. ");
            }
            k++;
        }

        System.out.println("-----------------------------------------------------------------------------------");

    }

    // 10 - Dati due Array V=[2,4,8,16] e V2=[3,6,9,12] crea un terzo Array V3 che contiene il prodotto scalare dei due Array.
    private static void algoritmo_10() {
        System.out.println("----------------------------------  Esercizio 10 ----------------------------------");
        System.out.println("10 - Dati due Array V=[2,4,8,16] e V2=[3,6,9,12] crea un terzo Array V3 che contiene il prodotto scalare dei due Array.");
        System.out.println("");

        int[] v1 = {2,4,8,16};
        int[] v2 = {3,6,9,12};
        int[] v3 = {0,0,0,0};
        int i = 0;
        int somma = 0;

        System.out.println("V1 = " + Arrays.toString(v1));
        System.out.println("V2 = " + Arrays.toString(v2));

        while (i < v1.length){
            v3[i] = v1[i] * v2[i];
            somma = somma + v3[i];
            i++;
        }

        System.out.println("Prodotto = " + Arrays.toString(v3));
        System.out.println("Prodotto = " + v3[0] + " + " + v3[1] + " + " + v3[2] + " + " + v3[3] + " = " + somma);

        System.out.println("-----------------------------------------------------------------------------------");

    }

    // #####################################################################################
    // ### Algoritmi su Matrici ###
    // M01 - Somma i valori contenuti in una matrice M di dimensione nxm e stampa a video
    private static void matrici_01() {
        System.out.println("----------------------------------  Matrici 01 ----------------------------------");
        System.out.println("M01 - Somma i valori contenuti in una matrice M di dimensione nxm e stampa a video");
        System.out.println("");

        int[][] matrice = {
                {0,1,2},
                {3,4,5},
        };
        int n = matrice.length;
        int m = matrice[0].length;
        int i = 0;
        int j = 0;
        int somma = 0;

        System.out.println("" + Arrays.toString(matrice[0]) + ", ");
        System.out.println("" + Arrays.toString(matrice[1]));

        while (i < n){
            while (j < m){
                somma = somma + matrice[i][j];
                j++;
            }
            i++;
            j = 0;
        }


        System.out.println("Somma = " + somma);

        System.out.println("-----------------------------------------------------------------------------------");

    }

    // M02 - Trova il massimo valore contenuto in una matrice M di dimensione nxm (Matrice quadrata)
    private static void matrici_02() {
        System.out.println("----------------------------------  Matrici 02 ----------------------------------");
        System.out.println("M02 - Trova il massimo valore contenuto in una matrice M di dimensione nxm (Matrice quadrata)");
        System.out.println("");

        int[][] matrice = {
                {3,4},
                {1,2},
        };
        int n = matrice.length;
        int m = matrice[0].length;
        int i = 0;
        int j = 0;
        int valore_massimo = 0;

        System.out.println("" + Arrays.toString(matrice[0]) + ", ");
        System.out.println("" + Arrays.toString(matrice[1]));

        if (n != 0 && m != 0) {
            valore_massimo = matrice[0][0];
        }

        while (i < n){
            while (j < m){
                if (matrice[i][j] > valore_massimo) {
                    valore_massimo = matrice[i][j];
                }
                j++;
            }
            i++;
            j = 0;
        }


        System.out.println("Valore massimo = " + valore_massimo);

        System.out.println("-----------------------------------------------------------------------------------");

    }

    // Algoritmo 01 del compito corretto in aula
    private static void compito_01(){
        System.out.println("----------------------------------  Compito 01 ----------------------------------");
        System.out.println("Compito 01 - Inserisci un numero in un vettore ordinato in ordine crescente");
        System.out.println("");

        int[] a = {1,2,5,6};

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il numero da inserire nel vettore " + Arrays.toString(a));

        int n = a.length;
        int[] b = new int[n+1];
        int i = 0;
        int j = 0;
        //int num = scan.nextInt(); // togliere il commento se si vuole inserire il numero manualmente
        int num = 4;
        boolean inserito = false;

        System.out.println("Vettore iniziale: " + Arrays.toString(a));
        System.out.println("Numero da inserire: " + num);

        while (i < n){
            if (a[i] < num || inserito){
                b[j] = a[i];
                i++;
            } else {
                b[j] = num;
                inserito = true;
            }
            j++;
        }

        if (inserito == false){
            b[j] = num;
        }


        System.out.println("Vettore finale: " + Arrays.toString(b));

        System.out.println("-----------------------------------------------------------------------------------");

    }

    // Dato un array di interi ed una target sum trova gli indici dei due numeri che sommati risultano essere il target (fermarsi appena si trova la coppia)
    public static void esercizio_2025_04_08_A(){
        System.out.println("----------------------------------  Esercizio 2024_04_08 - A - ----------------------------------");
        System.out.println("Esercizio 2024_04_08 - A - Dato un array di interi ed una target sum trova gli indici dei due numeri che sommati risultano essere il target (fermarsi appena si trova la coppia)");
        System.out.println("");

        int[] a = {1,2,3,2,4,5,5,6,0};
        int target_sum = 5;
        int i = 0;
        int j = 0;
        int[] coppia = new int[2];
        boolean coppia_trovata = false;

        System.out.println("Vettore iniziale: " + Arrays.toString(a));
        System.out.println("Target sum: " + target_sum);

        while (i < a.length && coppia_trovata == false){
            while (j < a.length && coppia_trovata == false){
                if (i != j){
                    if (a[i] + a[j] == target_sum){
                        coppia[0] = i;
                        coppia[1] = j;
                        coppia_trovata = true;
                    }
                }
                System.out.println("i= " + i + " - j=" + j);
                j++;
            }
            i++;
            j = i;
        }

        if (coppia_trovata) {
            System.out.println("La coppia di numeri è: " + a[coppia[0]] + " (indice " + coppia[0] + ") e " + a[coppia[1]] + " (indice " + coppia[1] + ")");
        } else {
            System.out.println("Non c'è una coppia di numeri che restituisce questa somma");
        }

        System.out.println("-----------------------------------------------------------------------------------");
    }


}
