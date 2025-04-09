
// Verifichi che una matrice abbia "1" nella posizione centrale e "0" nelle altre posizioni
public class MatriceCroce {

    public static void main(String[] args) {

        int[][] matrice = {
                {0,0,1,0,0},
                {0,0,1,0,0},
                {1,1,1,1,1},
                {0,0,1,0,0},
                {0,0,1,0,0},
        };

        boolean valido = true;
        if (matrice.length % 2 != 0) {
            int i = 0;
            while (i < matrice.length && valido) {

                int j = 0;
                while (j < matrice[i].length && valido) {

                    if (i == matrice.length/2 || j == matrice[i].length/2) {
                        if (matrice[i][j] != 1) {
                            valido = false;
                        }
                    }else {
                        if (matrice[i][j] != 0) {
                            valido = false;
                        }
                    }
                    j++;
                }

                i++;
            }

        }else {
            valido = false;
        }

        System.out.println(valido);
    }
}
