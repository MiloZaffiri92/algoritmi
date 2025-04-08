package src.algoritmi;
//Stampare la norma di una matrice,
// ovvero la somma di tutti i quadrati dei suoi elementi.
//Leggere n ed m, caricare A[nxm], stampare il valore della norma
public class MatrixNorm {
    public static void main(String[] args) {
        int[][] matrix ={
            {1,1,1},
            {1,1,1},
            {1,1,1}
        };
        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;
        int norm = 0;
        int square=0;

        while (i<n){
            int j = 0;
            while (j<m){
                square = matrix[i][j]*matrix[i][j];
                norm += square;
                j++;
            }
            i++;
        }
        System.out.print(norm);
    }
}
