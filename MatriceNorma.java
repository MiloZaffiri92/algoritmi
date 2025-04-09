
// Trovare la norma di una matrice, cioè la sommatoria del quadrato di tutti gli elementi.
public class MatriceNorma {

    public static void main(String[] args) {

        int[][] matrice = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int somma = 0;
        int i = 0;
        while (i < matrice.length) {

            int j = 0;
            while(j< matrice[i].length) {
                somma += matrice[i][j] * matrice[i][j];

                j++;
            }

            i++;
        }


        System.out.println("La norma della matrice è: " + somma);
    }
}
