/* Dato un array ordinato in ordine crescente V=[1,3,3,4,4,4,6,6,6,6,6]
controllare se ci sono numeri ripetuti e dire quanti e quali*/


public class VettoreContaNumRipetuti {


    public static void main(String[] args) {


        int[] vettore = new int[] {1,3,3,4,4,4,6,6,6,6,6};

        int count = 1;

        int i = 1;
        while (i < vettore.length) {

            if (vettore[i] == vettore[i - 1]) {
                count++;
            } else {
                if (count > 1) {

                System.out.println("Il numero " + vettore[i - 1] + " è stato ripetuto " + count + " volte.");
                count = 1;
                }
            }
            i++;
        }
            if (count > 1) {

                System.out.println("Il numero " + vettore[vettore.length-1] + " è stato ripetuto " + count + " volte.");


            }

    }
}

