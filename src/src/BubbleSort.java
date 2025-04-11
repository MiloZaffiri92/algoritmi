package src.src;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci la grandezza dell array");
        int n  = scanner.nextInt();
        int i = 0;

        int [] arr = new int[n];

        do {
            System.out.println("inserisci il numero nella posizione " + i);
            arr[i] = scanner.nextInt();
            i++;
        }while(i<n);

        i = 0;
        int j = 0;

        while(i< n -1){
            j=0;
            while(j<n-i-1){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
                j++;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
