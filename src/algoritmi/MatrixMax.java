package src.algoritmi;

public class MatrixMax {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,5},
                {7,2,2},
        };
        int n = matrix.length;;
        int m = matrix[0].length;

        int i=0;
        int max = 0;
        int posRows = 0;
        int posColumns = 0;

        while (i<n){
            int j = 0;
            while(j<m){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                    posRows=i;
                    posColumns=j;
                }
                j++;
            }
            i++;
        }
        System.out.println("The maximum is" + " " + max);
        System.out.println("The position in the matrix is" + " " + posRows + "," + posColumns);
    }
}
