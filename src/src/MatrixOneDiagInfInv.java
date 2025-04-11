package src.src;

public class MatrixOneDiagInfInv {

    //data una matrice quadrata mxm verificare che sia 1 nella diagonale principale e inversa
    //inoltre i valori al di fuori di questa diagonale devono essere o 0 o 1

    public static void main(String[] args) {
        /*int[][] matrix  = {
                {1, 0, 1, 0, 1},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 1, 1, 1, 0},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1}
        }; esempio di matrice con righe pari */

        int[][] matrix  = {
                {1, 0, 1, 0, 1},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 1, 1, 1, 0},
                {1, 0, 1, 0, 1}

        };
        int m = matrix.length;

        if(m % 2 != 0){

            int i = 0;
            int l = m-1;
            boolean valid = true;

            while(i < m && valid){
                int j = 0;
                while(j < m && valid){
                    if(i == j || i +j == l){
                        if(matrix[i][j] !=1){
                            valid = false;
                        }
                    }else{
                        if(matrix[i][j] != 0 && matrix[i][j] != 1){
                            valid = false;
                        }
                    }
                    j++;
                }
                i++;
            }

            if(valid){
                System.out.println("la matrice è valida");
            }else{
                System.out.println("la matrice non è valida");
            }

        }else{
            System.out.println("la matrice deve avere righe e colonne dispari");
        }

    }
}
