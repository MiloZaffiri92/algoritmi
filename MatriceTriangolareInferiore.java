
// Verificare che la matrice[n,n] sia triangolare inferiore
public class MatriceTriangolareInferiore {

    public static void main(String[] args) {

        int[][] matrice = {
                {1,0,0},
                {2,3,0},
                {4,5,6}
        };

        boolean triangolare = true;

        int i = 0;
        while(i < matrice.length && triangolare) {

            int j = i+ 1;
            while(j < matrice[i].length && triangolare) {

                if (matrice[i][j] != 0) {
                    triangolare = false;
                }
                j++;
            }
            i++;
        }

        System.out.println(triangolare);

    }
}
