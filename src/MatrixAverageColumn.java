import java.util.Scanner;
import java.util.Arrays;

public class MatrixAverageColumn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci numero di n: ");
        int n = scanner.nextInt();

        System.out.print("Inserisci numero di m: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Inserisci i valori della matrice:");
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < m) {
                System.out.print("inserisci il numero: ");
                matrix[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        
        int[] medieM = new int[m];
        
        int j = 0;
        while (j < m) {
            int somma = 0;
            i = 0;
            while (i < n) {
                somma += matrix[i][j];
                i++;
            }
            medieM[j] = somma / n; 
            j++;
        }
        
        System.out.print("media delle colonne della matrice: ");
        System.out.print(Arrays.toString(medieM));
    }
}
