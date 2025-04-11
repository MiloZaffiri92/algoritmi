package src.src;

import java.util.Arrays;
import java.util.Scanner;

public class OrderedArrayNoDup {
    // dato un array di numeri possibilmente ripetuti non in ordine crescente
    // costruire un'altro vettoreordinato in ordine crescente
    //senza valori ripetuti
    //v= {1,3,1,2,3,4,4,2}
    //vNoRip= {1,2,3,4}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserire la grandezza dell'array: ");
        int n = scanner.nextInt();

        //inizializzo array
        int [] arr = new int[n];

        //popolo array

        int i = 0;

        while(i < n){
            System.out.println("inserisci valore nella posizione: "+ i);
            arr[i] = scanner.nextInt();
            i++;
        }

        //ordinamento array

        i = 0;
        int temp = 0;

        while(i < arr.length-1){
            int j = 0;
            while(j < arr.length-i-1 ){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                j++;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));

        //una volta ordinato inserire gli elementi in un array temporaneo

        i = 0;
        int [] arrTemp = new int[arr.length];//array temporaneo che ha la stessa lunghezza dell'array originale
        int j = 0;// varibile per inserire se il numero è duplicato nell'array temporaneo

        while(i < arr.length){
            boolean dup = false;

            //controllo duplicato
            if(i > 0 && arr[i] == arr[i-1]){
                dup = true;
            }
            //negazione dup(se non è dup lo aggiungo all'array temporaneo)
            if(!dup){
                arrTemp[j] = arr[i];
                j++;
            }
            i++;
        }


        int[] arrNoDup = new int[j];
        i = 0;
        while(i < j){
            arrNoDup[i] = arrTemp[i];
            i++;
        }
        System.out.println("array ordinato di valori duplicati: "+ Arrays.toString(arrNoDup));

    }
}
