package src.src;

import java.util.Scanner;

public class ElementiRipetuti {
    //dato un array di numeri ordinati in modo crescente contare quanti elementi ripetuti ci sono
    //e stamparli
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci la grandezza dell'array: ");

        int n  = scanner.nextInt();
        int [] arr = new int[n];

        //popolamento
        int i = 0;
        while (i < arr.length){
            System.out.println("inserisci il numero nella posizione " + i);
            arr[i] = scanner.nextInt();
            i++;
        }
        i = 0;

        while(i < arr.length){
            int conta = 1;
            int j = i + 1;

            while(j < arr.length){

                if(arr[i] == arr[j]){
                    conta++;
                }else{
                    break;
                }
                j++;
            }
            // mi riporto all'ultima occorrenza del numero ripetuto
            i= j - 1;
            if(conta > 1){
                System.out.println("Elemento " + arr[i] +" ripetuto " + conta + " volte");
            }
            i++;
        }
    }
}
