package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        algoritmoSomma();
//        algoritmo2();
//        algoritmoPariDispari();
//        sommaArray();
//        fibonacci();
//        numeriRipetuti();
//        indiceUgualeNumero();
//          algoritmoEsame();
        algoritmoTargetSum();


    }

    private static void algoritmoSomma() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int somma = 0;

        while (i <= 1) {
            int num = scanner.nextInt();
            i++;
            somma = somma + num;


        }
        System.out.println("somma =" + somma);
        scanner.close();

    }

    private static void algoritmo2() {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int max = 0;
        int n = 3;

        while (i < n) {
            int num = scanner.nextInt();
            if (max < num) {
                max = num;
            }
            i++;
        }
        System.out.println(max);
    }

    private static void algoritmoPariDispari() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int pari = 0;
        int n = 4;

        int dispari= 0;

        while(i<n) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                pari++;
            } else {
                dispari++;
            }
            i++;
        }
        System.out.println("I numeri pari sono " + pari);
        System.out.println("I numeri dispari sono " + dispari);
    }

    //Somma gli elementi all'interno di un vettore
    private static void sommaArray() {

        int[] v = {120,23, 4,0,1};
        Scanner scanner = new Scanner(System.in);
        int somma = 0;
        int n = 5;
        int i = 0;

        while(i<n) {
            somma = somma + v[i];
            i++;
        }

        System.out.println("La somma è " + somma);
    }

    //Dato un array v di dimensione n = 7 riempi l'array con i primi 7 numeri della sequenza di fibonacci

    private static void fibonacci() {
        int i = 2;
        int n = 7;
        int[] v = new int[n];
        v[0] = 0;
        v[1] = 1;

        while(i<n){
            v[i] = v[i-2] + v[i-1];
            i++;
        }

        i = 0;

        while(i<n) {
            System.out.println(v[i]);
            i++;
        }
    }

    //algoritmi sui numeri ripetuti

    private static void numeriRipetuti() {
        int[] v = {1,1,2,1,2,0,2};
        int i = 0;
        int n = 7;
        int j = i + 1;
        boolean rip = false;

        while(i< n-1 && rip == false) {
            while(j<n && rip == false) {
                if(v[i] == v[j]) {
                    rip = true;
                }
                j++;
            }
            i++;
        }
        if(rip == true) {
            System.out.println("Ci sono numeri ripetuti");

        }
    }

    private static void indiceUgualeNumero(){

        int n = 7;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int[] v = new int[n];

        while(i < n){
            int num = scanner.nextInt();
            v[i] = num;
            i++;

        }

        i = 0;

        int uguali = 0;
        int diversi = 0;

        while (i < n) {
            if (v[i]== i) {
                uguali++;
            } else {
                diversi++;
            }
            i++;
        }

        if(diversi > 0) {
            System.out.println("non corrispondono");
        } else {
            System.out.println("corrispondono");
        }
    }

    private static void algoritmoEsame() {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int j = 0;
        int n = 4;
        int m = n+1;
        boolean ins = false;


        int[] a = new int[n];
        int[] b = new int[m];

        while(i<n) {
            System.out.println("inserisci un numero per l'array");
            int numero = scan.nextInt();
            a[i] = numero;
            i++;
        }

        i=0;

        Scanner scan1= new Scanner(System.in);


        System.out.println("Inserisci un numero: ");

        int num = scan1.nextInt();



        while(i<n) {
            if(a[i]<num || ins == true) {
                b[j] = a[i];
                i++;
            } else {
                b[j] = num;
            }
            j++;
        }

        if(ins == false) {
            b[j] = num;
        }
    }

    private static void algoritmoTargetSum() {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        int n = 5;
        int[] a = {1,2,3,1};
        int[] b = new int[2];
        System.out.println("inserisci la target sum:");
        int sum = scan.nextInt();
        boolean trovato = false;

        while(i<n-1 && !trovato) {
            int j = i+1;
            while(j<n && trovato == false) {
                    if(a[i] + a[j] == sum) {
                        b[0] = i;
                        b[1] = j;
                        trovato = true;
                    }
                j++;
            }
            i++;
        }

       i = 0;

        while(i<2) {
            System.out.println(b[i]);
            i++;
        }
    }
}