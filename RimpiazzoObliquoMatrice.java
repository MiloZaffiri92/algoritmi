import java.util.Arrays;

// Rimpiazzo obliquo di "1" nella diagonale principale di una matrice
public class RimpiazzoObliquoMatrice {

    public static void main(String[] args) {
        int[][] matrice = {
                {3, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int i = 0;
        while (i < matrice.length) {
            int j = 0;

            while (j < matrice[i].length) {

                if (i == j) {
                    matrice[i][j] = 1;
                }

                j += 1;
            }

            i += 1;
        }

        System.out.println(Arrays.deepToString(matrice));

    }
}
