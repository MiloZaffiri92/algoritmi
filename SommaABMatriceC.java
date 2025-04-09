import java.util.Arrays;

// Somma elementi matrici A & B e inserirli dentro la matrice C
public class SommaABMatriceC {
    public static void main(String[] args) {

    int[][] matriceA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    int[][] matriceB = {
            {2, 4, 6},
            {8, 10, 12},
            {14, 16, 18}
    };

    int[][] matriceC = new int[matriceA.length][matriceA[0].length];

    int i = 0;

    while(i < matriceA.length) {
        int j = 0;
        while(j < matriceA[i].length) {
            matriceC[i][j] = matriceA[i][j] + matriceB[i][j];
            j++;
        }
        i++;
    }

        System.out.println(Arrays.deepToString(matriceC));
    }

}
