package src.algoritmi;

import java.util.Arrays;
import java.util.Scanner;

//Dato un vettore di valori interi ordinati in senso crescente, inserire
//un nuovo intero in posizione ordinata.
//Leggere la dimensione n del vettore, definere An+1, caricare i primi n numeri
//e stampare il vettore
public class ArrayInsertInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arrayB =new int[4];
        int n = arrayB.length;
        int j = 0;
        int i = 1;

        while (i<n+1){
            arrayB[j] = i;
            i++;
            j++;

        }
        int [] arrayA= new int[n+1];
        System.out.print("Type number:");
        int number = scanner.nextInt();


        boolean inserted = false;
        i=0;
        while (i<n){
//            arrayA[j]=arrayB[j];

            if(number <= arrayB[i] &&!inserted){

                arrayA[i] = number;
                arrayA[i+1]= arrayB[j];

                inserted = true;



            }else {
                if(inserted){
                    arrayA[i + 1]=arrayB[i];
                }else {
                    arrayA[i] = arrayB[i];
                }



            }
            i++;
        }
        System.out.print(Arrays.toString(arrayA));
    }
}
