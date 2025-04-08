package src.algoritmi;
//Verificare che una matrice quadrata di numeri, A[nxn],
//sia costitutita da valori uno sulla riga e colonna centrale e da valori 0 altrove
//Controllare che la matrice abbia un numero di righe e colonne dispari
public class MatrixOneRowColumn {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,0},
                {1,1,1},
                {0,1,0}
        };

        int n= matrix.length;
        int m = matrix[0].length;

        if(n%2==1){
            int i = 0;
            int middle = (n-1)/2;
            boolean isTrue = true;
            while (i<n&&isTrue) {
                int j = 0;
                while (j<m&&isTrue){
                    if(i==middle || j==middle){
                        if(matrix[i][j]!=1){
                            isTrue = false;
                        }
                    } else {
                        if(matrix[i][j]!=0){
                            isTrue=false;
                        }
                    }
                    j++;
                }
                i++;
            }
            System.out.print(isTrue);

        }
    }
}
