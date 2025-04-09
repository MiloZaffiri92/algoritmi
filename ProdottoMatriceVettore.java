import java.util.Arrays;

// Data una matrice[n,m] e un vettore[m] riempire un vettore[n] col prodotto delle righe della matrice col vettore
public class ProdottoMatriceVettore {

    public static void main(String[] args) {

        int[][] matrice = {
                {1, 3, 1, 6},
                {6, 4, 9, 2},
                {5, 10, 3, 4}
        };

        int[] vettoreColonne = new int[] {1,2,3,4};
        int[] vettoreRighe = new int[matrice.length];

        int i = 0;
        while (i < matrice.length) {

            int j = 0;
            int somma = 0;
            while (j < matrice[i].length) {

                somma += matrice[i][j] * vettoreColonne[j];
                j++;
            }
            vettoreRighe[i] = somma;
            i++;
        }


        System.out.println(Arrays.toString(vettoreRighe));
    }
}
