package src.src;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci la lunghezza dell'array: ");
        int n = scanner.nextInt();

        //inizializzo array

        int [] arr = new int[n];
        //popolo array
        int i = 0;
        while (i < n){
            System.out.println("inserimento nella posizione " + i);
            arr[i] = scanner.nextInt();
            i++;
        }

        //verifica per ogni elemeneto dell'array se è pari o dispari e li conto

        i = 0;
        int cp = 0;
        int cd = 0;

        while(i < arr.length){
            if (arr[i] % 2 == 0){
                cp++;
            }else{
                cd++;
            }
            i++;
        }

        System.out.println("ci sono " + cp + " elementi pari nell'array");
        System.out.println("ci sono " + cd + " elementi dispari nell'array");

        //creazione array pari e dispari

        int [] arrEven = new int[cp];
        int [] arrOdd = new int[cd];

        int iEven = 0;
        int iOdd = 0;

        i = 0;

        while(i < arr.length){
            if (arr[i] % 2 == 0){
               arrEven[iEven++] = arr[i];
               //iEven++;
            }else{
                arrOdd[iOdd++] = arr[i];
                //iOdd++;
            }
            i++;
        }

        System.out.println("array pari: " + Arrays.toString(arrEven));
        System.out.println("array dispari: " + Arrays.toString(arrOdd));
    }
}
