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
}
