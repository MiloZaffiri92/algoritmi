
// Controllare che una matrice abbia valori diversi da "0" nelle posizioni centrali e calcolare il MIN e il MAX.
public class MatriceMinMax {

    public static void main(String[] args) {

        int[][] matrice = {
                {0, 3, 0},
                {6, 5, 1},
                {0, 4, 0}
        };
        int mezzo = matrice.length/2;
        int min = 0;
        int max = 0;
        if (matrice.length == matrice[0].length) {
            if (matrice.length % 2 != 0) {

                boolean verifica = true;
                int i = 0;
                while(i < matrice.length && verifica) {
                    if (matrice[i][mezzo] == 0 || matrice[mezzo][i] == 0) {
                        verifica = false;
                    }
                    i++;
                }
                if (matrice[0][mezzo] < matrice[mezzo][0]) {
                    min = matrice[0][mezzo];
                    max = matrice[mezzo][0];
                } else {
                    min = matrice[mezzo][0];
                    max = matrice[0][mezzo];
                }
                i = 1;
                while(i < matrice.length) {
                    if (matrice[i][mezzo] < min || matrice[mezzo][i] < min) {
                        if (matrice[i][mezzo] < matrice[mezzo][i]) {
                            min = matrice[i][mezzo];
                        }else {
                            min = matrice[mezzo][i];
                        }
                    }
                    i++;
                }

                i = 1;
                while(i < matrice.length) {

                    if(matrice[i][mezzo] > max || matrice[mezzo][i] > max) {
                        if (matrice[i][mezzo] > matrice[mezzo][i]) {
                            max = matrice[i][mezzo];
                        } else {
                            max = matrice[mezzo][i];
                        }
                    }
                    i++;
                }

            }
        }

        System.out.println("Minimo delle colonne/righe centrali: " + min);
        System.out.println("Massimo delle colonne/righe centrali: " + max);
    }
}
