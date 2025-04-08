package src.algoritmi;

import java.util.Scanner;

//Conta numeri pari e numeri dispari all' interno di un array di grandezza N

public class ArrayOddEvenCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Inserisci la grandezza dell'array: ");
        n= scanner.nextInt();
        int i = 0;

        int[] array= new int[n];
        while (i< array.length){
            System.out.println(("Inserisci un numero: "));
            array[i]= scanner.nextInt();
            i+=1;
        };

        int odd = 0;
        int even = 0;
        i = 0;

        while (i<n){
            if(array[i]%2 == 0){
                even +=1;
                i++;
            }else {
                odd +=1;
                i++;
            }
        }
        System.out.println("Ci sono" + " " + even + " " + "numeri pari");
        System.out.println("Ci sono" + " " + odd + " " + "numeri dispari");
    }
}
