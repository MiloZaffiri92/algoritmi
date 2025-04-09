public class SommaMatrice {


    public static void main(String[] args) {

        int[][] matrice = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int somma = 0;
        int i = 0;
        while (i < matrice.length) {
            int j = 0;
            while (j < matrice[i].length) {
                somma += matrice[i][j];
                j += 1;
            }

            i += 1;
        }

        System.out.println("La somma della matrice è:" + somma);

    }
}
