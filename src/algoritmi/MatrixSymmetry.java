package src.algoritmi;
//Data una matrice quadrata A[nxn], verificare se  è simmetrica
public class MatrixSymmetry {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {2,4,5},
                {3,5,8},

        };
        int n = matrix.length;
        int m = matrix[0].length;
        boolean isTrue=true;
        int i = 0;

        while(i<n&&isTrue){
        int j = 1;
        while (j<m){
            if (matrix[i][j] != matrix[j][i]) {
                isTrue = false;
                break;
            }
            j++;
        }
        i++;
        }
        if(isTrue){
            System.out.print("The matrix is symmetric");
        }else{
            System.out.print("The matrix is NOT symmetric");
        }
    }

}
