
// Trova il massimo valore contenuto in una matrice M di dimensione n x n ( Matrice quadrata)
public class MatriceMaxNum {

    public static void main(String[] args) {

        int[][] matrice = new int[][] {
                {10,20,30},
                {2 ,3 ,39},
                {15,18, 4}
        };

        int max = matrice[0][0];
        int i = 1;

        while(i < matrice.length) {
            int j = 0;
            while(j < matrice[i].length) {
                if (matrice[i][j] > max) {
                    max = matrice[i][j];
                }

                j++;
            }

            i++;
        }

        System.out.println(max);

    }
}
