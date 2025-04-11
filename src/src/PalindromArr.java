package src.src;

import java.util.Scanner;

public class PalindromArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci lunghezza Array: ");
        int n = scanner.nextInt();

        int [] arr = new int[n];

        //popolo array

        int i = 0;

        while(i < arr.length){
            System.out.println("inserisci elemento nella posizione " + i);
            arr[i] = scanner.nextInt();
            i++;
        }

        i = 0;
        int j = arr.length - 1;
        boolean pal = true;

        while (i < arr.length){
            if(arr[i] != arr[j]){
                pal = false;
                break;
            }
            i++;
            j--;
        }

        if(pal){
            System.out.println("array palindromo");
        }else{
            System.out.println("array non palindromo");
        }
    }
}
