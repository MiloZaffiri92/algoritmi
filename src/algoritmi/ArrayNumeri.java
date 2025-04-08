package src.algoritmi;

import java.util.Scanner;

public class ArrayNumeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Inserisci la grandezza dell'array: ");
        n= scanner.nextInt();
        int i = 0;

        int[] array= new int[n];
        do{
            System.out.println(("Inserisci un numero: "));
            array[i]= scanner.nextInt();
            i+=1;
        }while (i< array.length);

    }
}
