package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        algoritmo1();
        algoritmo2();
        algoritmo3();
        algoritmo4();
        algoritmo5();
        algoritmo6();
        algoritmo7();
        algoritmo8();
        algoritmo9();
        algoritmo10();
        algoritmo11();
        algoritmo12();
        algoritmo13();
        algoritmo14();
        algoritmo15();
        algoritmo16();
        algoritmo17();
        algoritmo18();
        algoritmo19();
        algoritmo20();
        algoritmo21();
        algoritmo22();
        algoritmo23();
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
        System.out.println("Facciamo la media in un insieme di numeri");
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

    public static void algoritmo3() {
        //Calcola i primi numeri della tabella di Fibonacci
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi conoscere della sequenza di Fibonacci?");
        int n = scan.nextInt();
        int i = 3;
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.println("Il numero 1 della serie di Fibonacci è: " + num1);
        System.out.println("Il numero 2 della serie di Fibonacci è: " + num2);
        do {
            num3 = num1 + num2;
            System.out.println("Il numero " + i + " della serie di Fibonacci è: " + num3);
            num1 = num2;
            num2 = num3;
            i++;
        } while (i <= n);
    }

    public static void algoritmo4() {
        //Quanti numeri sono più piccoli di un numero x in un insieme n
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto vuoi che sia grande l'insieme di numeri");
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

    public static void algoritmo5() {
        //dato un Array V=[120,23,4,0,1] somma tutti i numeri contenuti nell'array
        int[] array = {120, 23,4,0,1};
        int i = 0;
        int somma = 0;
        while (i < array.length) {
            somma = somma + array[i];
            i++;
        }
        System.out.println("La somma dei numeri nell'array è " + somma);
    }

    public static void algoritmo6() {
        //Dato un array V di dimensione n, dove n = 7, riempi l'array con i primi 7 numeri della sequenza di Fibonacci
        int n = 8;
        int i = 3;
        int[] array = new int[n];
        int num1 = 0;
        array[0] = num1;
        int num2 = 1;
        array[1] = num2;
        int num3;
        System.out.println("Il numero 1 della serie di Fibonacci è: " + num1);
        System.out.println("Il numero 2 della serie di Fibonacci è: " + num2);
        while (i < array.length) {
            num3 = num1 + num2;
            array[i] = num3;
            System.out.println("Il numero " + i + " della serie di Fibonacci è: " + num3);
            num1 = num2;
            num2 = num3;
            i++;
        }
    }

    public static void algoritmo7() {
        //Dato vettore V=[1,1,2,1,2,0,2] determina se ci sono numeri ripetuti
        int[] arrayV ={1,1,2,1,2,0,2};
        boolean repeat = false;
        int i = 0;
        int n = arrayV.length;
        while (i < n - 1 && !repeat) {
            int j = i + 1;
            while (j < n && !repeat) {
                if (arrayV[i] == arrayV[j]) {
                    repeat = true;
                }
                j++;
            }
            i++;
        }

        if (repeat) {
            System.out.println("Il vettore ha numeri ripetuti");
        } else {
            System.out.println("Il vettore non ha numeri ripetuti");
        }

    }

    public static void algoritmo8() {
        //Dato vettore V=[1,2,3,4,5,6,7] determina se ogni valore dell'array corrisponde al valore del suo indice
        int[] V = {1,2,3,4,5,6,7};
        int i = 0;
        int n = V.length;
        boolean same = true;
        while ((i < n) && same) {
            if (V[i] != i ) {
                same = false;
            }
            i++;
        }
        if (same) {
            System.out.println("I numeri nel vettore corrispondono ai valori del loro indice");
        } else {
            System.out.println("I numeri nel vettore non corrispondono ai valori del loro indice");
        }
    }

    public static void algoritmo9() {
        //Dato vettore V determina se ogni valore dell'array corrisponde al valore del suo indice pari contiene un numero pari e se ogni numero dispari contiene un numero dispari
        int[] v1 = {0,1,2,3,4,5,6,7};
        int[] v2 = {1,2,3,4,5,6,7,8};
        int[] v3 = {0};
        int i = 0;
        while (i < v1.length) {
            if (i % 2 == 0) {
                if (v1[i] % 2 == 0) {
                    System.out.println("Il numero " + i + " del vettore v1 è pari");
                } else {
                    System.out.println("Il numero " + i + " del vettore v1 non è pari");
                }
            } else {
                if (v1[i] % 2 == 1) {
                    System.out.println("Il numero " + i + " del vettore v1 è dispari");
                } else {
                    System.out.println("Il numero " + i + " del vettore v1 non è dispari");
                }
            }
            i++;
        }
        i = 0;
        while (i < v2.length) {
            if (i % 2 == 0) {
                if (v2[i] % 2 == 0) {
                    System.out.println("Il numero " + i + " del vettore v2 è pari");
                } else {
                    System.out.println("Il numero " + i + " del vettore v2 non è pari");
                }
            } else {
                if (v2[i] % 2 == 1) {
                    System.out.println("Il numero " + i + " del vettore v2 è dispari");
                } else {
                    System.out.println("Il numero " + i + " del vettore v2 non è dispari");
                }
            }
            i++;
        }
        i = 0;
        while (i < v3.length) {
            if (i % 2 == 0) {
                if (v3[i] % 2 == 0) {
                    System.out.println("Il numero " + i + " del vettore v3 è pari");
                } else {
                    System.out.println("Il numero " + i + " del vettore v3 non è pari");
                }
            } else {
                if (v3[i] % 2 == 1) {
                    System.out.println("Il numero " + i + " del vettore v3 è dispari");
                } else {
                    System.out.println("Il numero " + i + " del vettore v23 non è dispari");
                }
            }
            i++;
        }
    }

    public static void algoritmo10() {
        //Dato un array di dimensione n, riempi il vettore con le prime potenze di 2
        Scanner scan = new Scanner(System.in);
        System.out.println("Fino a che potenza di 2 vuoi arrivare?");
        int n = scan.nextInt();
        int[] array = new int[n + 1];
        int i = 1;
        if (n == 0) {
            System.out.println("Il risultato di 2 alla 0 è 1");
            array[0] = 1;
        } else {
            System.out.println("Il risultato di 2 alla 0 è 1");
            array[0] = 1;
            int num1 = 1;
            int num2 = 2;
            int num3;
            while (i < n + 1){
                num3 = num1 * num2;
                array[i] = num3;
                System.out.println("Il risultato di 2 alla "+ i + " è " + num3);
                num1 = num3;
                i++;
            }
        }
    }

    public static void algoritmo11() {
        //Dato vettore V di dimensione n, determina se il vettore è palindromo
        Scanner scan = new Scanner(System.in);
        System.out.println("Determina la grandezza del vettore");
        int n = scan.nextInt();
        int[] V = new int[n];
        int i = 0;
        while (i < n) {
            System.out.println("Inserisci un valore all'interno del vettore");
            V[i] = scan.nextInt();
            i++;
        }
        i = 0;
        int j = n - 1;
        boolean palindromo = true;
        while (i < j && palindromo) {
            if (V[i] != V[j]) {
                palindromo = false;
            }
            i++;
            j--;
        }
        if (palindromo) {
            System.out.println("Il vettore è palidromo");
        } else {
            System.out.println("Il vettore non è palidromo");
        }
    }

    public static void algoritmo12() {
        //Dato vettore V=[1,2,2,1,0,f,1,1] determina se ci sono numeri ripetuti
        String[] V = {"1","2","2","1","0","f","1","1"};
        int i = 0;
        boolean repeat = false;
        while (i < V.length - 1 && !repeat) {
            int j = i + 1;
            while (j < V.length) {
                if (V[i] == V[j]) {
                    repeat = true;
                }
                j++;
            }
            i++;
        }
        if (repeat) {
            System.out.println("Il vettore V ha valori ripetuti");
        } else {
            System.out.println("Il vettore V non ha valori ripetuti");
        }
    }

    public static void algoritmo13() {
        //Dato un vettore V=[1,3,3,4,4,4,6,6,6,6,6] ordinato in ordine crescente, determina se ci sono numeri ripetuti, nel caso ci siano stampa a video quali e quanti;
        int[] V = {1,3,3,4,4,4,6,6,6,6,6};
        int i = 0;

        while (i < V.length) {
            int j = i + 1;
            int repeat = 1;
            if (V[i] == V[j]) {
                repeat = repeat + 1;
                boolean repetition = true;
                j++;
                while ( j < V.length && repetition) {
                    if (V[i] == V[j]) {
                        repeat = repeat + 1;
                        j++;
                    } else {
                        repetition = false;
                    }
                }
                System.out.println("Il numero " + V[i] + " è presente nel vettore " + repeat + " volte");
                i = j;
            } else {
                i++;
            }
        }
    }

    public static void algoritmo14() {
        //Dati 2 array V v1=[2,4,8,16] e v2=[3,6,9,12], vrea un terzo array v3 che contiene il prodotto scalare di v1 e v2
        int[] v1 = {2,4,8,16};
        int[] v2 = {3,6,9,12};
        int n = 4;
        int[] v3 = new int[n];
        int i = 0;
        while (i < v1.length) {
            v3[i] = v1[i] * v2[i];
            System.out.println("Il prodotto scalare in posizione " + i + " è " + v3[i]);
            i++;
        }
    }

    public static void algoritmo15() {
        //Fai la sopmma dei valori contenuti in una matrice n x m
        Scanner scan = new Scanner(System.in);
        System.out.println("Quante righe vuoi che abbia la matrice?");
        int n = scan.nextInt();
        System.out.println("Quante colonne vuoi che abbia la matrice?");
        int m = scan.nextInt();
        int[][] M = new int[n][m];
        int somma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Inserisci il numero per la posizione [" + i + "][" + j + "]");
                M[i][j] = scan.nextInt();
                somma += M[i][j];
            }
        }
        System.out.println("La somma dei numeri nella matrice M è " + somma);
    }

    public static void algoritmo16() {
        //Trova il valore massimo contenuto in una matrice n x n
        Scanner scan = new Scanner(System.in);
        System.out.println("Quante righe/colonne vuoi che abbia la matrice?");
        int n = scan.nextInt();
        int[][] M = new int[n][n];
        int max = M[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Inserisci il numero per la posizione [" + i + "][" + j + "]");
                M[i][j] = scan.nextInt();
                if (M[i][j] > max) {
                    max = M[i][j];
                }
            }
        }
        System.out.println("Il numero più alto nella matrice M è " + max);
    }

    public static void algoritmo17() {
        //Inverti il vettore V=[1,2,3,10,5,6,8]
        int[] V = {1,2,3,10,5,6,8};
        int n = V.length;
        int i = 0;
        while (i < n / 2) {
            int j = n - 1 - i;
            int temp = V[i];
            V[i] = V[j];
            V[j] = temp;
            i++;
        }
        for (i = 0; i < V.length; i++) {
            System.out.println("il numero nel vettore V in posizione " + i + " ora è " + V[i]);
        }
    }

    public static void algoritmo18() {
        //Controlla se un Vettore V di grandezza n contiene un numero
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto vuoi che sia grande il vettore?");
        int n = scan.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci un numero nel vettore in posizione " + i );
            v[i] = scan.nextInt();
        }
        System.out.println("Quale numero vuoi controllare se è presente nel vettore?");
        int num = scan.nextInt();
        boolean repeat = false;
        for (int i = 0; i < n && !repeat; i++) {
            if (num == v[i]) {
                repeat = true;
            }
        }
        if (repeat) {
            System.out.println("Il numero " + num + " è presente nel vettore v");
        } else {
            System.out.println("Il numero " + num + " non è presente nel vettore v");
        }
    }

    public static void algoritmo19() {
        int[] v1 = {1,2,3,1,1,2,4,3,5,6,5,7};
        int n = v1.length;
        int[] v2 = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean duplicato = false;
            for (int j = 0; j < count; j++) {
                if (v1[i] == v2[j]) {
                    duplicato = true;
                    break;
                }
            }
            if (!duplicato) {
                v2[count] = v1[i];
                System.out.println("In posizione " + count + " del vettore v2 si trova il numero " + v1[i]);
                count++;
            }
        }
        System.out.print("Vettore senza duplicati: ");
        for (int i = 0; i < count; i++) {
            System.out.print(v2[i] + " ");
        }
    }

    public static void algoritmo20() {
        //Realizzare un algoritmo che verifichi se una matrice è identita(vale a dire che tutti i valori della diagonale principale è composta da 1)
        Scanner scan = new Scanner(System.in);
        System.out.println("Quante righe/colonne vuoi che abbia la tua matrice?");
        int n = scan.nextInt();
        int[][] m = new int [n][n];
        int i = 0;
        while (i < n ) {
            int j = 0;
            while (j < n) {
                System.out.println("Che numero vuoi inserire nella matrice m in posizione m[" + i + "][" + j + "]?");
                m[i][j] = scan.nextInt();
                j++;
            }
            i++;
        }
        i = 0;
        boolean identita = true;
        while (i < n && identita) {
            int j = 0;
            while (j < n && identita) {
                if (i == j) {
                    if (m[i][j] != 1) {
                        identita = false;
                    }
                }
                j++;
            }
            i++;
        }
        if (identita) {
            System.out.println("La matrice m è identita");
        } else {
            System.out.println("La matrice m non è identita");
        }
    }

    public static void algoritmo21() {
        //Realizzare un algoritmo che verifichi se una matrice m ha tutti 0 sulla parte triangolare superiore
        Scanner scan = new Scanner(System.in);
        System.out.println("Quante righe/colonne vuoi che abbia la tua matrice?");
        int n = scan.nextInt();
        int[][] m = new int [n][n];
        int i = 0;
        while (i < n ) {
            int j = 0;
            while (j < n) {
                System.out.println("Che numero vuoi inserire nella matrice m in posizione m[" + i + "][" + j + "]?");
                m[i][j] = scan.nextInt();
                j++;
            }
            i++;
        }
        i = 0;
        boolean triangolo = true;
        while (i < n && triangolo) {
            int j = 0;
            while (j < n && triangolo) {
                if (j > i) {
                    if (m[i][j] != 0) {
                        triangolo = false;
                    }
                }
                j++;
            }
            i++;
        }
        if (triangolo) {
            System.out.println("La matrice m ha il triangolo superiore che è composto da soli 0");
        } else {
            System.out.println("La matrice m ha il triangolo superiore che non è composto da soli 0");
        }
    }

    public static void algoritmo22() {
        //Realizzare un algoritmo da un vettore A disposto da numeri interi in posizione crescente aggiunga in un nuovo vettore B lungo n + 1 un nuovo numero messo nella posizione corretta
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto vuoi che sia lungo il vettore A");
        int n = scan.nextInt();
        int[] A = new int[n];
        int[] B = new int[n + 1];
        int i = 0;
        while (i < n) {
            System.out.println("Che numero vuoi aggiungere al vettore in ordine crescente?");
            A[i] = scan.nextInt();
            i++;
        }
        i = 0;
        int j = 0;
        boolean inserito = false;
        System.out.println("Che numero vuoi aggiungere nel vettore B?");
        int num = scan.nextInt();
        while (i < n) {
            if (A[i] < num || inserito) {
                B[j] = A[i];
                i++;
            } else {
                B[j] = num;
                inserito = true;
            }
            j++;
        }
        if (!inserito) {
            B[j] = num;
        }
        j = 0;
        System.out.print("Vettore B con numero aggiunto:");
        while (j < n + 1) {
            System.out.print(" " + B[j]);
            j++;
        }
    }

    public static void algoritmo23() {
        //Dato un array di interi ed una target sum, trova gli indice dei 2 numeri che sommati risultano essere il target; diagramma di flusso, java, passo passo, pseudo
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto vuoi che sia lungo il vettore");
        int n = scan.nextInt();
        int[] V = new int[n];
        int i = 0;
        while (i < n) {
            System.out.println("Che numero vuoi aggiungere nel vettore in posizione " + i + "?");
            V[i] = scan.nextInt();
            i++;
        }
        i = 0;
        System.out.println("Qual'è la somma di numeri che stai cercando?");
        int targetsum = scan.nextInt();
        boolean trovata = false;
        int[] V2 = new int[2];
        while (i < n - 1 && !trovata) {
            int j = i + 1;
            while (j < n && !trovata) {
                int somma = V[i] + V[j];
                if (somma == targetsum) {
                    trovata = true;
                    V2[0] = i;
                    V2[1] = j;
                }
                j++;
            }
            i++;
        }
        if (trovata) {
            System.out.println("La somma " + targetsum + " è stata trovata ed e composta dal numero in posizione " + V2[0] + " e " + V2[1] + " del vettore V, perchè " + V[V2[0]] + "+" + V[V2[1]] + "=" + targetsum);
        } else {
            System.out.println("La somma " + targetsum + " non è stata trovata nel vettore V");
        }
    }
}

