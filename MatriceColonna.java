
// Controllare che in una matrice ci siano tutti "1" nella prima colonna e "0" altrove
public class MatriceColonna {

    public static void main(String[] args) {

        int[][] matrice = {
                {1,0,0},
                {1,0,0}
        };

//        int[][] matrice = {
//                {1,0,1},
//                {0,0,0}
//        };

        boolean verifica = true;
        int i = 0;
        while (i < matrice.length && verifica) {

            int j = 0;
            while (j < matrice[i].length && verifica) {

                if(j==0) {
                    if (matrice[i][j] != 1) {
                        verifica = false;
                    }
                }else {
                    if (matrice[i][j] != 0) {
                        verifica = false;
                    }
                }
                j++;
            }
            i++;
        }

        System.out.println(verifica);
    }
}
