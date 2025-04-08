package src.algoritmi;

import java.util.Arrays;

//Dato un' array V di dimensione N, dove N = 7, reimpi l'array con i primi numeri della sequenza di Fibonacci
public class ArrayFibonacci {
    public static void main(String[] args) {

        int n = 7;

        int i;

        int[] V = new int[n];

        V[0]= 0;
        V[1] = 1;
        i=2;

        while (i < n){
            V[i] = V[i-1] + V[i-2];
            i++;
        }

        System.out.print(Arrays.toString(V));

    }
}
