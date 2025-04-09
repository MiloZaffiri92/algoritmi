
// Verificare che 2 matrici siano identiche
public class MatriciIdentiche {

    public static void main(String[] args) {

        int[][] matriceA = {
                {1,0,0},
                {2,3,0},
                {4,5,6}
        };

        int[][] matriceB = {
                {1,0,1},
                {2,3,0},
                {4,5,6}
        };

        boolean identico = true;
        int i = 0;
        while(i < matriceA.length && identico) {
            int j = 0;
            while (j < matriceA[i].length && identico) {
                if (matriceA[i][j] != matriceB[i][j]) {
                    identico = false;
                }
                j++;
            }

            i++;
        }


        System.out.println("Le matrici sono identiche? " + identico);
    }
}
