package src.algoritmi;

import java.util.Arrays;

//Dato un'array di dimensione N, riempi l'array con le prime n potenze di 2
//dove n=2, n=5, n=10
public class ArrayPower {
    public static void main(String[] args) {
        int n=10;
        int[] v = new int[n];
        v[0] = 2;
        int i = 1;

        while (i<n){
            v[i] = v[i-1]*2;
            i++;
        }
        System.out.print(Arrays.toString(v));
    }
}
