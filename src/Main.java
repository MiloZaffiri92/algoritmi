import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*
        algoritmo1();
        algoritmo2();
        algoritmo3();
        algoritmo4();
        algoritmo5();
        algoritmo6();
        algoritmo7();
        */
        algoritmo8();
    }

    /*
        private static void algoritmo1() {
            Scanner scan = new Scanner(System.in);
            System.out.println("inserisci un numero");
            int num1 = scan.nextInt();
            System.out.println("inserisci un secondo numero");
            int num2 = scan.nextInt();
            int somma = num1 + num2;
            System.out.println("la somma é:" + somma);
        }

        private static void algoritmo2() {
            Scanner scan = new Scanner(System.in);
            System.out.println("inserisci un numero");
            int num3 = scan.nextInt();
            System.out.println("inserisci secondo numero");
            int num4 = scan.nextInt();
            if (num3 > num4) {
                System.out.println("il numero" + num3 + "é maggiore");
            } else {
                System.out.println("il numero" + num4 + "é maggiore");
            }
        }
        private static void algoritmo3 () {
           Scanner scan = new Scanner(System.in);
            System.out.println("inserisci di quanti numeri vuoi fare la media");
           int n = scan.nextInt();
           int i = 0;
           int media = 0;
           int somma3 = 0;
           do {
               System.out.println("inserisci un numero");
               int num = scan.nextInt();
               somma3 = somma3 + num;
               i = i + 1;
           } while (i<n);
           media = somma3 / n;
           System.out.println("la media é : " + media);
        }
    }
    private static void algoritmo4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la grandezza dell'array");
        int n = scan.nextInt();
        int[] V = new int[n];
        int i = 0;
        while (i<n)  {
            System.out.println ("Inserisci valore");
            V[i]=scan.nextInt();
            i++;
        }
        i=0;
        int min = V[i];
        while (i < n)
        {
            if (V[i] < min)
            {
                min = V[i];
            }
            i++;
        }
        System.out.println("il minimo é : " + min);
    }
}

    private static void algoritmo5 () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il numero di righe");
        int n = scan.nextInt();
        System.out.println("Inserisci il numero di colonne");
        int m = scan.nextInt();
        int[][] M = new int[n][m];
        int i = 0;
        int j = 0;
        boolean iden = true;
        while (i < n) {
            while (j < m) {
                System.out.println("inserisci valore nella riga " + i);
                M[i][j] = scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        i = 0;
        j = 0;
        while (i < n && iden == true) {
            j = 0;
            while (j < m && iden == true) {
                if (i == j) {
                    if (M[i][j] != 1) {
                        iden = false;
                    }
                } else {
                    if (M[i][j] != 0) {
                    iden = false;
                }
            }
            j++;
        }
        i++;
    }
        if(iden==true) {
            System.out.println("La matrice é identità");

        } else {
            System.out.println("La matrice non é identità");
        }
    }

    private static void algoritmo6 () {
        Scanner scan= new Scanner(System.in);
        System.out.println("Inserisci numero di righe");
        int n= scan.nextInt();
        System.out.println("inserisci numero di colonne");
        int m= scan.nextInt();
        int [][] M= new int [n][m];
        int i=0;
        int j=n-1;
        boolean sup=true;
        boolean min=true;
        while (i<n) {
            while (j<m) {
                System.out.println("inserisci un valore nella riga " +i);
                M[i][j]=scan.nextInt();
                j++;
            }
            i++;
            j=0;
        }
        while(i<n && sup==true) {
            while (j<m && sup==true && min==true) {
                if (j!=0) {
                    if (M[i][j]==0) {
                        j--;
                    } else {
                        sup=false;
                    }

                } else {
                    min=false;
                }
            }
            i++;
            j=n-1;
        }
    if (sup==true) {
        System.out.println ("Consegna soddisfatta");
    } else
        System.out.println ("Non soddisfa la consegna");
    }

    private static void algoritmo7 () {
        Scanner scan=new Scanner(System.in);
        System.out.println("inserisci grandezza array");
        int n=scan.nextInt();
        int [] V=new int [n];
        int i=0;
        int j=0;
        int pos=0;
        int pos2=0;
        System.out.println("Inserisci SUM");
        int SUM=scan.nextInt();
        while(i<n) {
            System.out.println("Inserisci valori array " +i);
            V[i]=scan.nextInt();
            i++;
        }
        i=0;
        boolean tar=true;
        while (i<n-1 && tar==true) {
            while (j<n-1 && tar==true) {
                if (V[i]+V[j]==SUM){
                    tar=false;
                    pos=i;
                    pos2=j;
                }
                j++;
            }
            i++;
            j=0;
        }
        System.out.println("i valori che sommati formano SUM sono nelle posizioni: " +pos + " e " + pos2);
    }
*/
    private static void algoritmo8() {
        int[] array = {1,2,4,5,11};
        HashMap<Integer, Integer> nome = new HashMap<>();
        int targetsum = 7;
        int i=0;
        int[] coppia = new int[2];
        boolean coppia_trovata = false;
        System.out.println("Vettore iniziale: " + Arrays.toString(array));
        System.out.println("Target sum: "+ targetsum);
        while (i<array.length && coppia_trovata == false){
            nome.put(array[i],i);
            i++;
        }
        i=0;
        System.out.println("Hashmap: " + nome);
        while (i<array.length && coppia_trovata ==false){
            int differenza = targetsum - array[i];
            if (nome.get(differenza) != null){
                coppia[0] = i;
                coppia[1] = nome.get(differenza);
                coppia_trovata = true;
            }
            i++;
        }
        System.out.println("");
        if (coppia_trovata) {
            System.out.println("La coppia di numeri é: " + array[coppia[0]] + " (indice " + coppia[0] + ") e " + array[coppia[1]] + " (indice" + coppia[1] + ")");
        } else {
            System.out.println("Consegna non rispettata");
        }

    }
}

