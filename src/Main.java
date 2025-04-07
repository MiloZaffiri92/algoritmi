import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        algoritmo1();
        System.out.println("Ho eseguito l'algoritmo 1");
        System.out.println("-------------------------");
        algoritmo2();
        System.out.println("Ho eseguito l'algoritmo 2");
        System.out.println("-------------------------");
        algoritmo3();
        System.out.println("Ho eseguito l'algoritmo 3");
        System.out.println("-------------------------");
        algoritmo4();
        System.out.println("Ho eseguito l'algoritmo 4");
        System.out.println("-------------------------");
        algoritmo5();
        System.out.println("Ho eseguito l'algoritmo 5");
        System.out.println("-------------------------");
        algoritmo6();
        System.out.println("Ho eseguito l'algoritmo 6");
        System.out.println("-------------------------");
        algoritmo7();
        System.out.println("Ho eseguito l'algoritmo 7");
        System.out.println("-------------------------");
        algoritmo8();
        System.out.println("Ho eseguito l'algoritmo 8");
        System.out.println("-------------------------");
        algoritmo9();
        System.out.println("Ho eseguito l'algoritmo 9");
        System.out.println("-------------------------");
        algoritmo10();
        System.out.println("Ho eseguito l'algoritmo 10");
        System.out.println("-------------------------");
        algoritmo11();
        System.out.println("Ho eseguito l'algoritmo 11");
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

    private static void algoritmo10()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dal vettore");
        int n = scan.nextInt();
        int[] V = new int[n];
        int[] V2 = new int[n];
        int i = 0;
        int ripetuti = 0;
        int j = i + 1;
        int k=0;
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
        while (i < n - 1)
        {
            j=i+1;
            while (j < n)
            {
                if (V[i] == V[j])
                {
                    ripetuti++;
                    V2[k]=V[i];
                    k++;
                }
                j++;
            }
            i++;
        }
        k=0;
        if(ripetuti>0)
        {
            System.out.println("Si ripetono : " + ripetuti + " numeri e sono : ");
            while(k<ripetuti)
            {
                System.out.print("["+V2[k]+"]");
                k++;
            }
        }
        else
        {
            System.out.println("I numeri non sono ripetuti");
        }

    }
    private static void algoritmo11() //prodotto scalare
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Inserisci la grandezza dei vettori");
        int n= scan.nextInt();
        int prodottoscalare=0;
        int[] V = new int[n];       //{2,4,8,16};
        int[] V2 = new int[n];      //{3,6,9,12};
        int[] V3= new int[1];
        int i=0;
        int j=0;
        int prod=0;
        while(i<n)
        {
            System.out.println("Inserisci il valore da inserire nel primo vettore");
            V[i] = scan.nextInt();
            System.out.println("Inserisci il valore da inserire nel secondo vettore");
            V2[i] = scan.nextInt();
            i++;
        }
        i=0;
        while(i<n)
        {
            prod=V[i]*V2[i];
            prodottoscalare=prodottoscalare+prod ;
            i++;
        }
        V3[j]=prodottoscalare;
        System.out.println("Il prodotto scalare è : " + V3[j]);
    }

}