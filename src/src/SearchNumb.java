package src.src;

import java.util.Scanner;

public class SearchNumb {

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);
        System.out.print("inserisci la grandezza dell' array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int i = 0;
        while(i < n ){
            System.out.println("insersici il valore nella posizione: "+i);
            arr[i] = scanner.nextInt();
            i++;
        }

        System.out.print("inserisci il numero da cercare: ");
        int num = scanner.nextInt();
        i = 0;
        int pos = 0;
        boolean trovato = false;
        while(i < n){
            if(arr[i] == num){
                trovato = true;
                pos = i;
            }
            i++;
        }

        if(trovato){
            System.out.println("elemento trovato nella posizione "+pos);
        }else{
            System.out.println("elemento non trovato");
        }
    }
}
