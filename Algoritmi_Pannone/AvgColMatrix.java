import java.util.Arrays;
import java.util.Scanner;

public class AvgColMatrix {
//    Calcolare il valore medio delle colonne di una matrice
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di righe: ");
        int n = scanner.nextInt();
        System.out.println("Inserisci il numero di colonne: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        int i = 0;

        while(i < matrix.length) {
            int j = 0;
            while(j < matrix[i].length) {
                System.out.println("Inserisci un numero: ");
                matrix[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        i = 0;

        int [] array = new int[matrix[0].length];
        while(i < matrix[0].length) {
            int somma = 0;
            int j = 0;
            while (j < matrix.length) {
                somma += matrix[j][i];
                j++;
            }
            array[i] = somma / matrix.length;
            i++;
        }
        System.out.println(Arrays.toString(array));

    }
}
