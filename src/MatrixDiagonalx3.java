import java.util.Scanner;
import java.util.Arrays;

public class MatrixDiagonalx3 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Inserimento dimensione matrice quadrata
            System.out.print("Inserisci la dimensione della matrice quadrata: ");
            int n = scanner.nextInt();

            int[][] matrice = new int[n][n];

            // Riempimento matrice
            System.out.println("Inserisci i valori della matrice:");
            int i = 0;
            while (i < n) {
                int j = 0;
                while (j < n) {
                    System.out.print("Valore in posizione [" + i + "][" + j + "]: ");
                    matrice[i][j] = scanner.nextInt();
                    j++;
                }
                i++;
            }

            // Verifica se la matrice è bandata di larghezza 3
            boolean bandata = true;
            i = 0;
            while (i < n && bandata) {
                int j = 0;
                while (j < n) {
                    if (Math.abs(i - j) <= 1) {
                        if (matrice[i][j] != 1) {
                            bandata = false;
                            break;
                        }
                    } else {
                        if (matrice[i][j] != 0) {
                            bandata = false;
                            break;
                        }
                    }
                    j++;
                }
                i++;
            }

            // Stampa della matrice
            System.out.println("\nMatrice inserita:");
            i = 0;
            while (i < n) {
                System.out.println(Arrays.toString(matrice[i]));
                i++;
            }

            // Risultato finale
            System.out.println("\nÈ una matrice bandata di larghezza 3? " + bandata);
        }
    }





