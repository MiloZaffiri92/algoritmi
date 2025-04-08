package src.algoritmi;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Inserisci la grandezza dell'array: ");
        n= scanner.nextInt();
        int i = 0;
        int[] array= new int[n];
        do{
            System.out.println(("Inserisci un numero: "));
            array[i]= scanner.nextInt();
            i+=1;
        }while (i< array.length );
        i = 0;
        do{
            sum += array[i];
            i+=1;
        }while (i< array.length);
        System.out.print("La somma è: " + sum);

    }
}
