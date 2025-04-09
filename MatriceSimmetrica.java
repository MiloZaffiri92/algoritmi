// Verificare che una matrice sia simmetrica. cioè A[i,j] = A[j,i]
public class MatriceSimmetrica {

    public static void main(String[] args) {

        int[][] matrice = {
                {0,1},
                {1,2}
        };

        boolean simmetrico = true;

        int i = 0;
        while (i < matrice.length && simmetrico) {

            int j = 0;
            while (j < matrice[i].length && simmetrico) {
                if(matrice[i][j] != matrice[j][i]){
                    simmetrico = false;
                }
                j++;
            }
            i++;
        }

        System.out.println(simmetrico);
    }
}
