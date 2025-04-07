public class gitAlgoritmi {
    public static void main(String[] args) {

        //algoritmosomma();
        //algoritmoripetuti();
        //algoritmo3();
        //algoritmo4();
        //algoritmo5();
        //algoritmo6();
        //algoritmo7();
        //algoritmo8();
        //algoritmo9();

    }

   /* public static void algoritmosomma() {

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

    /* public static void algoritmoripetuti() {

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

       /* public static void algoritmo3() {

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


            /* public static void algoritmo4() {
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

               /*   public static void algoritmo6() {
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
                 }    */




                    /* public static void algoritmo7() {

                        Scanner algoritmo7 = new Scanner(System.in);
                        int i = 0;
                        int j = 0;
                        int k=0;
                        int n=4;
                        int[] V1 = {2,4,8,16};
                        int[] V2 = {3,6,9,12};
                        int[] V3 = new int [n];

                        while (i<n) {

                            V3[k] = V1[i] * V2[j];
                            i++;
                            j++;
                            k++;
                        }
                        System.out.println("V3=[ ");
                        k=0;
                        while (k<n) {
                            System.out.print(V3[k] + " ");
                            k++;
                        }
                        System.out.println("]");
                    } */



                        /* public static void algoritmo8() {
                            Scanner algoritmo8 = new Scanner(System.in);

                            int i=0;
                            int n=9;
                            int t=72;
                            int[] V = {4,9,12,20,24,27,29,30,72};
                            boolean trovato = false;

                            while ((i<n) && (!trovato)) {
                                if (V[i] == t) {
                                    trovato = true;
                                } else {
                                    i++;
                                }
                            }
                            if (trovato == false) {
                                System.out.println("Il numero " + t + " non è stato trovato");
                            } else {
                                System.out.println("Il numero trovato è = " + t + " alla posizione " + i);
                            }
                        } */



                            /* public static void algoritmo9() {
                                Scanner algoritmo9 = new Scanner(System.in);

                                int i = 0;
                                System.out.println("inserisci grandezza array");
                                int n = algoritmo9.nextInt();
                                int[] V = new int[n];
                                while (i < n) {
                                    System.out.print("Inserisci il numero " + (i) + ": ");
                                    V[i] = algoritmo9.nextInt();
                                    i++;
                                }

                                i=0;
                                int j=n-1;
                                while (i < n/2) {

                                    int temp = V[i];
                                    V[i] = V[j];
                                    V[j] = temp;
                                    i++;
                                    j--;

                                }

                                int k=0;
                                while (k<n) {
                                    System.out.print( V[k] + " ");
                                    k++;
                                }
                            } */



}