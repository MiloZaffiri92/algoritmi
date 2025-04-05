import java.util.Scanner;
import java.util.Arrays;

public class MatrixIndexGrow {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Inserisci numero di righe: ");
            int righe = scanner.nextInt();

            System.out.print("Inserisci numero di colonne: ");
            int colonne = scanner.nextInt();

            int[][] matrice = new int[righe][colonne];

            System.out.println("Inserisci i valori della matrice:");
            int i = 0;
            while (i < righe) {
                int j = 0;
                while (j < colonne) {
                    System.out.print("Valore in posizione [" + i + "][" + j + "]: ");
                    matrice[i][j] = scanner.nextInt();
                    j++;
                }
                i++;
            }

            boolean crescente = true;
            int precedente = matrice[0][0];

            i = 0;
            while (i < righe && crescente) {
                int j = 0;
                while (j < colonne) {
                    if (i == 0 && j == 0) {
                        j++;
                        continue;
                    }

                    if (matrice[i][j] < precedente) {
                        crescente = false;
                        break;
                    }
                    precedente = matrice[i][j];
                    j++;
                }
                i++;
            }


            System.out.println("Matrice inserita:");
            i = 0;
            while (i < righe) {
                System.out.println(Arrays.toString(matrice[i]));
                i++;
            }


            System.out.println("Numeri in ordine crescente? " + crescente);
        }
    }





