
// Somma Scalare di 2 matrici
public class MatriciSommaScalare {

    public static void main(String[] args) {

        int[][] matriceA = {
                {1, 3, 1},
                {6, 4, 9}
        };

        int[][] matriceB = {
                {-1, -3, -1},
                {-6, -4, -9}
        };

        boolean nullo = true;

        int i = 0;
        while (i < matriceA.length && nullo) {

            int j = 0;
            while(j < matriceA[i].length && nullo) {

                if (matriceA[i][j] + matriceB[i][j] != 0) {
                    nullo = false;
                }

                j++;
            }
            i++;
        }
        System.out.println(nullo);
    }
}
