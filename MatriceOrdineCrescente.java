
// Data una matrice quadrata verificare che sia costituita da valori sempre crescenti
public class MatriceOrdineCrescente {

    public static void main(String[] args) {

        int[][] matrice = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        boolean crescente = true;
        int i = 0;
        while( i < matrice.length && crescente) {

            int j = 0;
            while (j < matrice[i].length-1 && crescente) {
                if (i > 0 && j == 0) {
                    if (matrice[i][j] < matrice[i-1][matrice.length - 1]) {
                        crescente = false;
                    }
                } else {
                    if (matrice[i][j] > matrice[i][j+1]) {
                        crescente = false;
                    }

                }

                j++;
            }

            i++;
        }

        System.out.println(crescente);
    }
}
