package src.algoritmi;

import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int min = 0;
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
        min=array[0];
        do{
            if(array[i] < min){
                min = array[i];
                i+=1;
            }else {
                i+=1;
            }

        }while (i< array.length);
        System.out.print("Il minimo è: " + min);

    }
}
