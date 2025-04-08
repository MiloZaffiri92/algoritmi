package src.algoritmi;
//Verificare se una matrice quadrata sia costituita da valori crescenti
public class MatrixIncrease {
    public static void main(String[] args) {
        int[][] matrix={
                {0,1,2,3},
                {4,5,6,7},
                {8,9,10,11},
                {12,13,14,15}
        };

        int i = 0;
        boolean isIncresing=true;
        int n = matrix.length;
        int count = 0;

        while (i<n&&isIncresing){
            int j = 0;
            while (j<n){
                if(matrix[i][j] != count){
                    isIncresing = false;
                }
                j++;
                count++;
            }
            i++;
        }
        System.out.print(isIncresing);
    }
}
