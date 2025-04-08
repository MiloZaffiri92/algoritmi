import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*System.out.println("Trovare il minimo in un array");
        algoritmo1();
        System.out.println("Ho eseguito l'algoritmo 1");
        System.out.println("-------------------------");
        System.out.println("Sommare tutti i numeri contenuti in un array");
        algoritmo2();
        System.out.println("Ho eseguito l'algoritmo 2");
        System.out.println("-------------------------");
        System.out.println("Riempire un array con i primi n numeri della sequenza di Fibonacci");
        algoritmo3();
        System.out.println("Ho eseguito l'algoritmo 3");
        System.out.println("-------------------------");
        System.out.println("Determina se ci sono numeri ripetuti in un array");
        algoritmo4();
        System.out.println("Ho eseguito l'algoritmo 4");
        System.out.println("-------------------------");
        System.out.println("Determina se ogni valore dell'array corrisponde al valore del suo indice");
        algoritmo5();
        System.out.println("Ho eseguito l'algoritmo 5");
        System.out.println("-------------------------");
        System.out.println("Determina se in un array, ogni indice pari contiene un numero pari, e ogni indice dispari contiene un numero dispari");
        algoritmo6();
        System.out.println("Ho eseguito l'algoritmo 6");
        System.out.println("-------------------------");
        System.out.println("Riempire l'array con n potenze di 2");
        algoritmo7();
        System.out.println("Ho eseguito l'algoritmo 7");
        System.out.println("-------------------------");
        System.out.println("Determina se l'array è palindromo");
        algoritmo8();
        System.out.println("Ho eseguito l'algoritmo 8");
        System.out.println("-------------------------");
        System.out.println("Determina se ci sono numeri ripetuti in un array contenente anche lettere");
        algoritmo9();
        System.out.println("Ho eseguito l'algoritmo 9");
        System.out.println("-------------------------");
        System.out.println("Dato un array ordinato crescente,determina se ci sono numeri ripetuti,stampare a video quali e quanti");
        algoritmo10();
        System.out.println("Ho eseguito l'algoritmo 10");
        System.out.println("-------------------------");
        System.out.println("Dati due array, creare un terzo array che contiene il prodotto scalare dei due array");
        algoritmo11();
        System.out.println("Ho eseguito l'algoritmo 11");
        System.out.println("-------------------------");
        System.out.println("Somma dei valori in una matrice");
        algoritmo12();
        System.out.println("Ho eseguito l'algoritmo 12");
        System.out.println("-------------------------");
        System.out.println("Massimo dei valori in una matrice");
        algoritmo13();
        System.out.println("Ho eseguito l'algoritmo 13");
        System.out.println("-------------------------");
        System.out.println("Inverti un array");
        algoritmo14();
        System.out.println(" ");
        System.out.println("Ho eseguito l'algoritmo 14");
        System.out.println("-------------------------");
        System.out.println("Controllare su un vettore di grandezza n contiene il valore m");
        algoritmo15();
        System.out.println("Ho eseguito l'algoritmo 15");
        System.out.println("-------------------------");
        System.out.println("Controllare se una matrice è matrice identità(ovvero tutti 1 sulla diagonale principale e tutti 0 altrove)");
        algoritmo16();
        System.out.println("Ho eseguito l'algoritmo 16");
        System.out.println("-------------------------");
        algoritmoTest();
        System.out.println(" ");
        System.out.println("Ho eseguito l'algoritmo del Test");*/
        System.out.println("-------------------------");
        algoritmoTargetSum();
        System.out.println("Ho eseguito l'algoritmo target sum");
        System.out.println("-------------------------");
    }

    private static void algoritmo1() //Minimo in un array
    {
        int i = 0;
        int[] V = new int[]{0, 1, 2, 5, -1, -20, 22};
        int min = V[i];
        while (i < V.length) {
            if (V[i] < min) {
                min = V[i];
            }
            i++;
        }
        System.out.println("Il minimo è: " + min);
    }

    private static void algoritmo2() { //somma numeri dentro un vettore
        int i = 0;
        int[] V = new int[]{120, 23, 4, 0, 1};
        int somma = 0;
        while (i < V.length) {
            somma = somma + V[i];
            i++;
        }
        System.out.println("Il somma è: " + somma);
    }

    private static void algoritmo3() //Riempire array con i primi n numeri della sequenza di fibonacci
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la grandezza del vettore");
        int n = scan.nextInt();
        int i = 2;
        int[] V = new int[n];
        V[i - 2] = 0;
        V[i - 1] = 1;
        while (i < n) {
            V[i] = V[i - 2] + V[i - 1];
            i++;
        }
        i = 0;
        while (i < n) {
            System.out.println(V[i]);
            i++;
        }
    }

    private static void algoritmo4() //Determina se ci sono numeri ripetuti
    {
        int i = 0;
        int j = i + 1;
        boolean ripetuti = false;
        int[] V = new int[]{1, 1, 2, 1, 2, 0, 2};
        while (i < V.length - 1) {
            if (V[i] == V[j]) ;
            i++;
            ripetuti = true;
        }
        if (ripetuti == true) {
            System.out.println("I numeri sono ripetuti");
        } else {
            System.out.println("I numeri non sono ripetuti");
        }
    }

    private static void algoritmo5() //Determina se ogni valore corrisponde al valore dell'indice
    {
        int i = 0;
        int[] V = new int[]{1, 2, 3, 4, 5, 6, 7};
        while (i < V.length) {
            if (V[i] == i) {
                System.out.println("Il numero " + V[i] + " corrisponde all'indice " + i);
            } else {
                System.out.println("Il numero " + V[i] + " non corrisponde all'indice " + i);
            }
            i++;
        }
    }

    private static void algoritmo6() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        System.out.println("Inserisci la grandezza del vettore");
        int n = scan.nextInt();
        int[] array = new int[n];
        int num;
        boolean ris = true;
        while (i < n) {
            System.out.println("Inserisci il numero da inserire nel vettore: ");
            num = scan.nextInt();
            array[i] = num;
            i = i + 1;
        }
        i = 0;
        while (i < n && ris == true) {
            if (i % 2 == 0) {
                if (array[i] % 2 == 0) {
                    System.out.println("L'indice pari " + i + " contiene un numero pari " + array[i]);
                } else {
                    System.out.println("L'indice pari " + i + " non contiene un numero pari " + array[i]);
                    ris = false;
                }
            } else {
                if (array[i] % 2 != 0) {
                    System.out.println("L'indice dispari " + i + " contiene un numero dispari " + array[i]);
                } else {
                    System.out.println("L'indice dispari " + i + " non contiene un numero dispari " + array[i]);
                    ris = false;
                }
            }
            i++;
        }
    }

    private static void algoritmo7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la grandezza del vettore");
        int n = scan.nextInt();
        int i = 0;
        int a = 2;
        int[] V = new int[n];
        while (i < n) {
            V[i] = (int) Math.pow(a, i);
            i++;
        }
        i = 0;
        while (i < n) {
            System.out.print("[ " + V[i] + " ]");
            i++;
        }
    }

    private static void algoritmo8() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la dimensione del vettore");
        int n = scan.nextInt();
        int i = 0;
        int j = n - 1;
        int[] V = new int[n];
        int num;
        boolean palindromo = true;
        while (i < n) {
            System.out.println("Inserisci il numero da inserire nel vettore");
            num = scan.nextInt();
            V[i] = num;
            i++;
        }
        i = 0;
        while (i < n / 2) {
            if (V[i] == V[j] && palindromo == true) {
                palindromo = true;
            } else {
                palindromo = false;
            }
            i++;
            j--;
        }
        if (palindromo == true) {
            System.out.println("L'array è palindromo");
        } else {
            System.out.println("L'array non è palindromo");
        }

    }

    private static void algoritmo9() //Dato un array V=[1,2,b,2,1,0,f,1,1,f,a] controlla se ci sono numeri ripetuti
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la dimensione del vettore");
        int n = scan.nextInt();
        scan.nextLine();
        String[] V = new String[n];//{"1","2","b","2","1","0","f","1","1","f","a"};
        int i = 0;
        while (i < n) {
            System.out.println("Inserisci il valore da inserire nel vettore");
            V[i] = scan.nextLine();
            i++;
        }
        i = 0;
        int j = i + 1;
        boolean ripetuti = false;
        while (i < n - 1) {
            while (j < n) {
                if (V[i].equalsIgnoreCase(V[j])) ;
                {
                    ripetuti = true;
                }
                j++;
            }
            i++;
        }
        if (ripetuti == true) {
            System.out.println("I caratteri sono ripetuti");
        } else {
            System.out.println("I caratteri non sono ripetuti");
        }
    }

    private static void algoritmo10() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dal vettore");
        int n = scan.nextInt();
        int[] V = new int[n];
        int[] V2 = new int[n];
        int i = 0;
        int ripetuti = 0;
        int j = i + 1;
        int k = 0;
        while (i < n) {
            System.out.println("Inserisci il valore da inserire nel vettore");
            V[i] = scan.nextInt();
            while (i != 0 && V[i] < V[i - 1]) {
                System.out.println("Hai inserito un numero minore del precendente, l'array deve essere crescente ");
                System.out.println("Inserisci un nuovo valore da inserire nel vettore ");
                V[i] = scan.nextInt();
            }
            i++;
        }
        i = 0;
        while (i < n - 1) {
            j = i + 1;
            while (j < n) {
                if (V[i] == V[j]) {
                    ripetuti++;
                    V2[k] = V[i];
                    k++;
                }
                j++;
            }
            i++;
        }
        k = 0;
        if (ripetuti > 0) {
            System.out.println("Si ripetono : " + ripetuti + " numeri e sono : ");
            while (k < ripetuti) {
                System.out.print("[" + V2[k] + "]");
                k++;
            }
        } else {
            System.out.println("I numeri non sono ripetuti");
        }

    }

    private static void algoritmo11() //prodotto scalare
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dei vettori");
        int n = scan.nextInt();
        int prodottoscalare = 0;
        int[] V = new int[n];       //{2,4,8,16};
        int[] V2 = new int[n];      //{3,6,9,12};
        int[] V3 = new int[1];
        int i = 0;
        int j = 0;
        int prod = 0;
        while (i < n) {
            System.out.println("Inserisci il valore da inserire nel primo vettore");
            V[i] = scan.nextInt();
            System.out.println("Inserisci il valore da inserire nel secondo vettore");
            V2[i] = scan.nextInt();
            i++;
        }
        i = 0;
        while (i < n) {
            prod = V[i] * V2[i];
            prodottoscalare = prodottoscalare + prod;
            i++;
        }
        V3[j] = prodottoscalare;
        System.out.println("Il prodotto scalare è : " + V3[j]);
    }

    private static void algoritmo12() //somma valori in una matrice
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire il numero di righe della matrice");
        int n = scan.nextInt();
        System.out.println("Inserire il numero di colonne della matrice");
        int m = scan.nextInt();
        int[][] Matrix = new int[n][m];
        int i = 0;
        int j = 0;
        int somma = 0;
        while (i < n) {
            while (j < m) {
                System.out.println("Inserire i valori della matrice nella riga " + i);
                Matrix[i][j] = scan.nextInt();
                somma = somma + Matrix[i][j];
                j++;
            }
            i++;
            j = 0;
        }
        System.out.println("La somma dei valori contenuti nella matrice è : " + somma);
    }

    private static void algoritmo13() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il numero delle righe");
        int n = scan.nextInt();
        System.out.println("Inserisci il numero delle colonne");
        int m = scan.nextInt();
        int i = 0;
        int j = 0;
        int[][] M = new int[n][m];
        int max = M[i][j];
        while (i < n) {
            while (j < m) {
                System.out.println("Inserire i valori della matrice nella riga " + i);
                M[i][j] = scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        i = 0;
        j = 0;
        while (i < n) {
            while (j < m) {
                if (M[i][j] > max) {
                    max = M[i][j];
                }
                j++;
            }
            i++;
            j = 0;
        }
        System.out.println("Il valore massimo è : " + max);
    }

    private static void algoritmo14() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dell'array");
        int n = scan.nextInt();
        int[] V = new int[n];
        int i = 0;
        int j = n - 1;
        int temp = 0;
        while (i < n) {
            System.out.println("Inserire un valore nell'array");
            V[i] = scan.nextInt();
            i++;
        }
        i = 0;
        while (i < n / 2) {
            temp = V[i];
            V[i] = V[j];
            V[j] = temp;
            i++;
            j--;
        }
        i = 0;
        while (i < n) {
            System.out.print("[ " + V[i] + " ]");
            i++;
        }
    }

    private static void algoritmo15() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la grandezza del vettore");
        int n = scan.nextInt();
        int[] V = new int[n];
        System.out.println("Inserire il valore da cercare");
        int m = scan.nextInt();
        int i = 0;
        while (i < n) {
            System.out.println("Inserisci i valori nel vettore");
            V[i] = scan.nextInt();
            i++;
        }
        i = 0;
        boolean trovato = false;
        while (i < n && trovato == false) {
            if (V[i] == m) {
                trovato = true;
            }
            i++;
        }
        if (trovato == true) {
            System.out.println("Il valore " + m + " è contnuto nell'array");
        } else {
            System.out.println("Il valore " + m + " non è contnuto nell'array");
        }

    }

    private static void algoritmo16() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il numero di righe");
        int n = scan.nextInt();
        System.out.println("Inserisci il numero di colonne");
        int m = scan.nextInt();
        int[][] M = new int[n][m];
        int i = 0;
        int j = 0;
        boolean identità = true;
        while (i < n) {
            while (j < m) {
                System.out.println("Inserisci i valori nella riga " + i);
                M[i][j] = scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        i = 0;
        j = 0;
        while (i < n && identità == true) {
            while (j < m && identità == true) {
                if (i == j) {
                    if (M[i][j] != 1) {
                        identità = false;
                    }
                } else {
                    if (M[i][j] != 0) {
                        identità = false;
                    }
                }
                j++;
            }
            i++;
        }
        if (identità) {
            System.out.println("La matrice è identità ");
        } else {
            System.out.println("La matrice non è identità ");
        }

    }

    private static void algoritmoTest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire la grandezza del vettore");
        int n = scan.nextInt();
        int[] A = new int[n];
        int[] B = new int[n + 1];
        int i = 0;
        int j = 0;
        System.out.println("Inserire un numero da inserire nel vettore");
        int num = scan.nextInt();
        boolean inserito = false;
        while (i < n) {
            System.out.println("Inserisci i valori nel vettore");
            A[i] = scan.nextInt();
            i++;
        }
        i = 0;
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
        while (j < n + 1) {
            System.out.print("[" + B[j] + "]");
            j++;
        }
    }

    private static void algoritmoTargetSum()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Inserisci la grandezza del vettore ");
        int n=scan.nextInt();
        int[] V = new int [n];
        int a=0;
        int b=0;
        System.out.println("Inserisci la target sum ");
        int ts= scan.nextInt();
        int i=0;
        boolean trovato=false;
        while(i<n)
        {
            System.out.println("Inserisci il valore nella posizione " + i + "  del vettore");
            V[i]=scan.nextInt();
            i++;
        }
        i=0;
        int j=i+1;
        while(i<n-1 && !trovato)
        {
            while(j<n && !trovato )
            {
                if(V[i]+V[j]==ts)
                {
                    a=i;
                    b=j;
                    trovato=true;
                }
                j++;
            }
            i++;
            j=i+1;
        }
        System.out.println("I valori che sommati restituiscono la target sum si trovano negli indici : " +a+ " e " +b);
    }
}