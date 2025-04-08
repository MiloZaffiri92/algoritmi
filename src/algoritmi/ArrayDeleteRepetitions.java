package src.algoritmi;

import java.util.Arrays;

//Dato un vettore di numeri possibilmente ripetuti, costruire un altro vettore ordinato in ordine crescente,
//senza numeri ripetuti
public class ArrayDeleteRepetitions {
    public static void main(String[] args) {
        int[] array={1,2,4,3,3,7,1,4,5};
        int n = array.length;
        int temp;
        int i =0;

        while(i<n){
            int j = 0;
            while (j<n-1-i){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
                j++;
            }
            i++;
        }
        i = 1;

        int count = 1;
        while (i<n){
            if(array[i]!=array[i-1]){
                count++;
            }
            i++;
        }
        int[] arrayB = new int[count];
        arrayB[0]=array[0];
        int k = 1;
        i = 1;
        while (i<n){
            if(array[i]!=array[i-1]){
                arrayB[k]=array[i];
                k++;
            }
            i++;
        }
        System.out.print(Arrays.toString(arrayB));
    }
}
