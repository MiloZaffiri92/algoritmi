package src.algoritmi;

//Dato un'array ordinato in ordine crescente,
//determina se ci sono numeri ripetuti, nel caso in cui, stampa a video quali e quanti
//v=[1,3,3,4,4,4,6,6,6,6,6]
//v=[1,2,3]
public class ArrayRepetitions {
    public static void main(String[] args) {

        int[] array = {1, 2, 2, 2, 3, 4, 4, 5};

        int n = array.length;
        if (n == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int current = array[0];
        int count = 1;
        int i = 1;

        while (i<n) {
            if (array[i] == current) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println("Number " + current + " is repeated " + count + " times.");
                }
                current = array[i];
                count = 1;
            }
            i++;
        }

        if (count > 1) {
            System.out.println("Number " + current + " is repeated " + count + " times.");
        }
    }
}
