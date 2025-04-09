import java.util.Arrays;

/* Dato un vettore di numeri possibilmente ripetuti. Costruire un altro vettore ordinato in ordine crescente
*  senza valori ripetuti. */
public class VettoreNoRipetizioni {

    public static void main(String[] args) {

        int[] vettore = new int[] {3,7,3,9,1,1};

        Arrays.sort(vettore);

        int dim = 1;
        int i = 1;
        while (i < vettore.length) {

            if (vettore[i] != vettore[i - 1]) {
                dim++;
            }

            i++;
        }

        int[] vettoreNoDuplicati = new int[dim];

        vettoreNoDuplicati[0] = vettore[0];
        i = 1;
        int j = 1;
        while (i < vettore.length) {

            if (vettore[i] != vettore[i - 1]) {
                vettoreNoDuplicati[j] = vettore[i];
                j++;
            }

            i++;
        }

        System.out.println(Arrays.toString(vettoreNoDuplicati));
    }
}
