
// Mettere "1" sulla diagonale principale e "0" sugli altri punti
public class RimpiazzoCompletoMatrice {

    public static void main(String[] args) {

        int[][] matrice = {
                {3, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int i = 0;
        while(i < matrice.length) {

            int j = 0;
            while (j < matrice[i].length) {

                if (i == j)
                    matrice[i][j] = 1;
                else
                   matrice[i][j] = 0;

                System.out.print(matrice[i][j] + " ");
                j += 1;
            }

            System.out.println();
            i += 1;
        }

    }

}
