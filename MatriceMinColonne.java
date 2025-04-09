import java.util.Arrays;

// Trovare il valore minimo di ogni colonna di una matrice e salvarlo dentro un vettore
public class MatriceMinColonne {

    public static void main(String[] args) {

        int[][] matrice = {
                {9,8,2},
                {3,6,5},
                {4,1,9}
        };

        int[] vettore = new int[matrice[0].length];

        int i = 0;
        while (i < matrice[0].length) {

            int min = matrice[0][i];
            int j = 1;
            while (j < matrice.length ) {
                if (matrice[j][i] < min) {
                    min = matrice[j][i];
                }
                j++;
            }
            vettore[i] = min;
            i++;
        }

        System.out.println("Minimo di ogni colonna: " + Arrays.toString(vettore));

    }
}
