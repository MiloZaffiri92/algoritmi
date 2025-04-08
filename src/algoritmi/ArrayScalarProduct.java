package src.algoritmi;

import java.util.Arrays;

//Dati due array v=[2,4,6,8,16] e v2=[3,6,9,12]
// crea un terzo array v3 contenente il prodotto scalare dei due array
public class ArrayScalarProduct {
    public static void main(String[] args) {
        int[] array = {2,4,8,16};
        int[] arrayTwo = {3,6,9,12};
        int n = array.length;
        int m = arrayTwo.length;
        int[] arrayThree = new int[m];
        int product = 0;

        if(n == m){
            int i = 0;
            while (i<n){
                product += arrayTwo[i] * array[i];

                arrayThree[0] = product;
                i++;
            }

        }
        System.out.print(Arrays.toString(arrayThree));


    }
}
