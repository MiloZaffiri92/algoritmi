import java.util.Scanner;

public class FileAlgoritmi {
    public static void main(String[] args) {

        //algoritmosomma();
        //algoritmoripetuti();
        //algoritmo3();
        //algoritmo4();
        //algoritmo5();
        //algoritmo6();

    }

   /* private static void algoritmosomma() {

        Scanner sumarray = new Scanner(System.in);
        int i = 0;
        System.out.println("inserisci grandezza array");
        int n = sumarray.nextInt();
        int[] array = new int[n];
        int somma = 0;
        while (i < n) {
            System.out.print("Inserisci il numero " + (i) + ": ");
            array[i] = sumarray.nextInt();
            somma = somma + array[i];
            i++;
        }
        System.out.println("La somma dei numeri inseriti è: " + somma);

        sumarray.close();

    }*/

    /* private static void algoritmoripetuti() {

        Scanner ripetutiarray = new Scanner(System.in);
        System.out.println("Inserisci grandezza array");
        int n = ripetutiarray.nextInt();
        int[] array = new int[n];
        int i = 0;
        while (i < n) {
            System.out.print("Inserisci il numero " + i + ": ");
            array[i] = ripetutiarray.nextInt();
            i++;
        }

        boolean ripetuti = false;
        i = 0;

        while (i < n - 1 && !ripetuti) {
            int j = i + 1;
            while (j < n) {
                if (array[i] == array[j]) {
                    ripetuti = true;
                    break;
                }
                j++;
            }
            i++;
        }

        if (ripetuti) {
            System.out.println("ci sono numeri ripetuti");
        } else {
            System.out.println("non ci sono numeri ripetuti");
        }
        ripetutiarray.close();
    }
}*/

       /*private static void algoritmo3() {

           Scanner algoritmo3 = new Scanner(System.in);
           int i = 0;
           System.out.println("Inserisci la grandezza del vettore");
           int n = algoritmo3.nextInt();
           int[] array = new int[n];
           int num;
           while (i < n) {
               System.out.println("Inserisci il numero da inserire nel vettore: ");
               num = algoritmo3.nextInt();
               array[i] = num;
               i ++;

           }

           boolean valore = false;
           i=0;
           while (i<n) {
               if(array[i] == i && !valore) {
                       System.out.println("il numero " + array[i] + " è uguale all'indice " +i);
               } else {
                   System.out.println("il numero " + array[i] + " è diverso dall'indice " +i);
               }
               i++;
           }
           algoritmo3.close();
       }
}*/


            /* private static void algoritmo4() {
                Scanner algoritmo4 = new Scanner(System.in);

                System.out.println("inserisci grandezza vettore");
                int n = algoritmo4.nextInt();
                int[]array = new int[n];
                int num;
                int i = 0;
                while (i<n) {
                    System.out.println("numero da inserire nel vettore: ");
                    num = algoritmo4.nextInt();
                    array[i] = num;
                    i++;
                }

                i=0;
                while (i<n) {
                    if (i % 2 == 0 && array[i] % 2 == 0) {
                        System.out.println("l'indice " + i + " ha un numero pari " + array[i]);
                    } else {
                        System.out.println("l'indice " + i + " ha un numero dispari " + array[i]);
                    }
                    i++;
                }

            }

}*/

             /* public static void algoritmo5() {
                 Scanner algoritmo5 = new Scanner(System.in);
                 int n = 10;
                 int [] array = new int[n];
                 int i = 0;

                 while (i<n) {
                     array[i] = (int)Math.pow(2,i);
                     i++;
                 }
                 i=0;
                 while (i<n) {
                     System.out.print(array[i] + " ");
                     i++;
                 }
                 algoritmo5.close();

             }
}*/

    private static void algoritmo6() {
        Scanner algoritmo6 = new Scanner(System.in);

        int n = 5;
        int[] array = new int[n];
        int i=0;
        int num;
        while (i<n) {
            System.out.println("numero da inserire nel vettore: ");
            num = algoritmo6.nextInt();
            array[i] = num;
            i++;
        }

        i=0;
        int j=4;
        boolean palindromo = true;


        while (i<n) {
            if (array[i] != array[j]) {
                palindromo=false;
            }
            i++;
            j=j-1;
        }
        if (palindromo) {
            System.out.println("Il vettore è palindromo.");
        } else {
            System.out.println("Il vettore NON è palindromo.");
        }
    }
}