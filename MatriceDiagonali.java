
// Verificare che una matrice abbia tutti "1" nella diagonale principale ed inversa
public class MatriceDiagonali {

    public static void main(String[] args) {

        int[][] matrice = {
                {1,0,1},
                {0,1,0},
                {1,0,1}
        };

//        int[][] matrice = {
//                {1,0,1},
//                {0,1,0},
//                {1,0,1}
//        };

        boolean valido = true;
        if (matrice.length % 2 != 0) {
            int i = 0;
            while (i < matrice.length && valido) {
                if (matrice[i][i] != 1 || matrice[i][matrice[i].length-1-i] != 1) {
                    valido = false;
                }
                i++;
            }
        } else
            valido = false;


        System.out.println(valido);
    }
}
