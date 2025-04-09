import java.util.Arrays;
import java.util.Scanner;

/*
    Trovare la media dei valori delle colonne di una matrice e caricarli in un vettore di grandezza m.
    Stampare il vettore.
 */
public class MatriceMediaColonne {

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

        i = 0;

        int [] vettore = new int[matrice[0].length];
        while (i < matrice[0].length) {
            int somma = 0;
            int j = 0;
            while(j < matrice.length) {

                somma += matrice[j][i];
                j++;
            }
            vettore[i] = somma/ matrice.length;
            i++;
        }

        System.out.println(Arrays.toString(vettore));
    }
}
