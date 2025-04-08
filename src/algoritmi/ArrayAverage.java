package src.algoritmi;
//Calcolare il valore medio dei numeri interi contenuti in un vettore
public class ArrayAverage {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int n = array.length;
        int sum = 0;
        int i = 0;
        while (i< n){
            sum += array[i];
            i++;
        }

        int avg = sum/n;


        System.out.print("The average is" + " " + avg);



    }
}
