
// Rimpiazzo obliquo inverso di "1" nella diagonale della matrice
public class RimpiazzoInversoMatrice {

    public static void main(String[] args) {

        int[][] matrice = {
                {3, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int i = 0;

        while(i < matrice.length) {

            matrice[i][matrice.length-i-1] = 1;
            i += 1;
        }

        i = 0;
        while (i < matrice.length) {

            int j = 0;
            while(j < matrice[i].length) {

                System.out.print(matrice[i][j] + " ");

                j += 1;
            }
            System.out.println();
            i += 1;
        }

    }
}
