package src;

import java.util.Scanner;

public class Main {
}package src;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public class StrutturaFileJava {
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
        }
        private static void algoritmo1() {
            System.out.println("Hello and welcome!");
        }


        private static void algoritmo2() {
            public class Main {

                public static void main(String[] args) {
                    //inserimento di n numeri in un vettore
                }
                Scanner scan= new Scanner(System.in);
                int i=0;
                System.out.println("Inserisci la grandezza del vettore");
                int size = scan.nextInt();
                int[] array= new int [size];
                int num;
                while(i<size) {
                    System.out.println("inserisci numero da inserire nel vettore");
                    num = scan.nextInt();
                    array[i] = num;
                    i = i+1;
                }
                System.out.println("il vettore è" + i );
            }

        }
        private static void algoritmo3(){
            //somma di due numeri
            public static void main(String[] args) {
                Scanner scan= new Scanner(System.in);
                System.out.println("inserisci un numero");
                int num1= scan.nextInt();
                System.out.println("inserisci un secondo numero");
                int num2=scan.nextInt();
                int somma = num1 + num2;
                System.out.println("la somma è" + somma);
            }
        }
        private static void algoritmo4() {
            //somma dei numeri in un vettore
            int[] array= {120,23,4,0,1};
            int somma = 0;
            int i = 0;
            while (i< array.length){
                somma = somma + array[i];
                i++;
            }
            System.out.println("La somma dell'array è:" + somma);
        }

        private static void algoritmo5() {
            //riempire un array con i primi n numeri della sequenza di Fibonacci
            Scanner scan= new Scanner(System.in);
            System.out.println("Inserisci la grandezza del vettore");
            int n = scan.nextInt();
            int i = 2;
            int[] V = new int [n];
            V[i-2]=0;
            V[i-1]=1;
            while (i<n) {
                V[i]=V[i-2]+V[i-1];
                i++;
            }
            i=0;
            while (i<n){
                System.out.println(V[i]);
                i++;
            }
        }
        public static void algoritmo6() {
            //Dato V=[1,1,2,1,2,0,2] determina se ci sono numeri ripetuti
            int[] array = new int []{1, 1, 2, 1, 2, 0, 2};
            boolean trovatoRipetuto = false;
            int i = 0;
            int j = 1;
            while (i < array.length-1) {
                while (j < array.length) {
                    if (array[i] == array[j]) {
                        trovatoRipetuto= true;
                    }
                    j = j+1;
                }
                i = i+1;
            }
            {
                if (trovatoRipetuto) {
                    System.out.println("ci sono numeri ripetuti " );
                } else {
                    System.out.println("non ci sono numeri ripetuti");

                }
            }
        }

        public static void algoritmo7() {
            //Dato V [1,2,3,4] determina se ogni valore dell'array cossisponde al suo indice
            int [] array = new int[] {1,2,3,4,5,6,7};
            boolean uguali= true;
            int i=0;
            while (i<array.length){
                if (array[i]!=i){
                    uguali=false;
                    System.out.println("i valori corrispondono all'indice");
                }
                else {
                    System.out.println("i valori non corrispondono all'indice");
                }
                i++;
            }
        }
        public static void algoritmo8() {
            //Dato un array determina e ogni indice pari contiene un numero pari es e ogni indice dispari contiene un numero dispari
            //dove (0==pari) dove V=[0,1,2,3,4,5] dove V=[1,2,3,4] dove=[0],doveV=[]
            int [] array =new int[] {1,2,3,4};
            int i =0;
            boolean diversi=true;
            while (i<array.length){
                if((array[i]%2==0)==(i%2==0) && (array[i]%2!=0)==(i%2!=0)){
                    diversi=true;
                    System.out.println("i valori corrispondono");
                }
                else{
                    System.out.println("i valori non corrispondono");
                }
                i++;
            }
        }
        public static void algoritmo9() {
            //Dato un array di dimensione n, riempi l'array con le prime n potenze di 2. Dove n=2,n=5,n=10
            Scanner scan = new Scanner(System.in);
            int i=0;
            System.out.println("Inserisci la grandezza dell'array");
            int size= scan.nextInt();
            int [] array= new int [size];
            int potenza=1;
            while (i<array.length){
                array[i]=potenza;
                System.out.println("2^" + i + "=" + array[i]);
                potenza*=2;
                i++;
            }


        }

        public static void algoritmo10() {
            //Dato un array V di dimensione n determina de l'array è palindromo
            int[] array= new int[] {1,2,3,2,2};
            int i=0;
            boolean palindromo=true;
            int j=array.length-1;
            while(i<j){
                if(array[i] != array[j]){
                    palindromo=false;
                }
                i++;
                j--;
            }
            if (array[i] != array[j]){
                System.out.println("l'array è palindromo");
            }
            else {
                System.out.println("l'array non è palindromo");
            }
        }

        public static void algoritmo11() {
            //Dato un array ordinato in ordine crescente V=[1,3,3,4,4,4,6,6,6,6,6] determina se ci sono numeri ripetuti, nel caso stampa a video quali e quanti
            int[] V = new int[]{1, 3, 3, 4, 4, 4, 6, 6};
            int count = 1;
            int i=1;

            while( i < V.length) {
                if (V[i] == V[i - 1]) {
                    count++;
                } else {
                    if (count > 1) {
                        System.out.println("Numero " + V[i - 1] + " ripetuto " + count + " volte.");
                    }
                    count = 1;
                }
                i++;
            }
            if (count > 1) {
                System.out.println("Numero " + V[V.length - 1] + " ripetuto " + count + " volte.");
            }
        }
    }
    public static void algoritmo12() {
        //Dati due Array V=[2,4,8,16] e V2=[3,6,9,12] cre un terzo Array che contiene il prodotto scalare dei due Array
        int [] V= new int[]{2,4,8,16};
        int[] V2= new int[]{3,6,9,12};
        int[] V3= new int[4];
        int i=0;
        int prodottoScalare=0;
        while (i < V.length) {
            prodottoScalare=prodottoScalare+V[i]*V2[i];
            System.out.println("V3["+ prodottoScalare + "]");
            i++;
            prodottoScalare=0;
        }
    }


    public static void algoritmo13() {
        //1-Realizzare un algoritmo che verifichi se una matrice
        //è identità (vale a dire che ha tutti 1 sulla diagonale
        //e tutti 0 altrove) (la diagonale principale parte da M[0][0] e finisce
        //a M[n-1][n-1]
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci la grandezza della matrice");
        int n = scan.nextInt();
        int[][] M = new int[n][n];
        int i = 0;
        int j = 0;
        System.out.println("inserisci gli element della matrice");
        while (i < M.length) {
            while (j < M.length) {
                System.out.println("M[" + i + "][" + j + "]=");
                M[i][j] = scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        boolean identita = true;
        while (i < M.length) {
            while (j < M.length) {
                if (i == j && M[i][j] != 1) {
                    identita = false;
                } else if (i != j && M[i][j] != 0) {
                    identita = false;
                }
                j++;
            }
            i++;
            j = 0;
        }
        if (identita) {
            System.out.println("la matrice è identità");
        }
        else {
            System.out.println("la matrice non è identità");
        }
    }
    public static void algoritmo14() {
        //Realizzare un algoritmo che verifichi se una matrice ha tutti 0
        //sulla parte triangolare superiore
        //(il triangolo superiore alla diagonale principale
        //con essa non compresa)
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la grandezza della matrice");
        int n = scan.nextInt();
        int[][] M = new int[n][n];
        int i=0;
        int j=0;
        System.out.println("inserisci gli elementi della matrice");
        while (i < M.length) {
            while (j < M.length) {
                System.out.println("M[" + i + "][" + j +"]=");
                M[i][j] = scan.nextInt();
                j++;
            }
            i++;
            j=0;
        }
        i=0;
        boolean triangolare = true;
        while (i < M.length) {
            j=i+1;
            while (j < M.length) {
                if (M[i][j] != 0) {
                    triangolare=false;
                }
                j++;
            }
            i++;
        }
        if (triangolare) {
            System.out.println("La matrice è triangolare superiore");
        } else {
            System.out.println("La matrice NON è triangolare superiore");
        }
    }
}
public static void algoritmo15() {
    //Realizzare un algoritmo che trovi il minimo per ogni colonna
    //di una matrice. I risultati devono essere memorizzati in un vettore
    //il quale deve poi essere stampato
    Scanner scan = new Scanner(System.in);
    System.out.println("Inserire la grandezza della matrice");
    int n = scan.nextInt();
    int M[][] = new int[n][n];
    int[] V = new int[n];
    int i = 0;
    int j = 0;
    System.out.println("Inserisci i valori della matrice");
    while (i < M.length) {
        while (j < M.length) {
            System.out.println("M[" + i + "][" + j + "]=");
            M[i][j] = scan.nextInt();
            j++;
        }
        i++;
        j=0;
    }
    j= 0;
    while (j < M.length) {
        i=0;
        int min=M[i][j];
        while (i < M.length) {
            if (M[i][j] < min) {
                min = M[i][j];
            }
            i++;
        }
        V[j]=min;
        j++;
    }
    System.out.println("Vettore dei minimi per colonna:");
    int k = 0;
    while (k < n) {
        System.out.println("V=[" + k + "]="+V[k]);
        k++;
    }

}
}


        }




