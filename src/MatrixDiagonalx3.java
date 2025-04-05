import java.util.Scanner;
import java.util.Arrays;

public class MatrixDiagonalx3 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Inserisci la dimensione della matrice quadrata: ");
            int n = scanner.nextInt();

            int[][] matrice = new int[n][n];

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

            System.out.println("Matrice inserita:");
            i = 0;
            while (i < n) {
                System.out.println(Arrays.toString(matrice[i]));
                i++;
            }

            System.out.println("È una matrice bandata di larghezza 3? " + bandata);
        }
    }





