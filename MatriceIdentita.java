
// Verificare se una matrice sia identita (ha tutti 1 sulla diagonale principale e 0 altrove).
public class MatriceIdentita {

    public static void main(String[] args) {

        int[][] matrice = new int[][] {
                {1,0,0},
                {0,1,0},
                {0,0,1},
        };

        boolean identita = true;
        int i = 0;
        while (i < matrice.length && identita) {

            int j = 0;
            while (j < matrice[i].length && identita) {

                if (j == i) {
                    if (matrice[i][j] != 1) {
                        identita = false;
                    }
                } else {
                    if (matrice[i][j] != 0) {
                        identita = false;
                    }
                }

                j++;
            }

            i++;
        }

        System.out.println(identita);

    }
}
