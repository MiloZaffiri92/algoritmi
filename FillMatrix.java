import java.util.Arrays;
import java.util.Scanner;

public class FillMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci numero di righe: ");
        int n = scanner.nextInt();
        System.out.println("Inserisci numero di colonne: ");
        int m = scanner.nextInt();

        int[][] matrice = new int[n][m];

        int i = 0;
        while (i < matrice.length) {
            int j = 0;
            while (j < matrice[i].length ) {
                System.out.println("Inserisci numero: ");
                matrice[i][j] = scanner.nextInt();
                j += 1;
            }
            i += 1;
        }

        System.out.println(Arrays.deepToString(matrice));


    }

}
