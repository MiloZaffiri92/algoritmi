package src.algoritmi;
//Data una matrice A di n righe ed m colonne,
//che contenga una sottomatrice con gli elementi uguali 1,
//determinare il numero di righe e colonne della sottomatrice
public class MatrixSubMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,0,3},
                {0,0,0},
                {0,0,0},
        };
        int columns = 1;
        int rows = 1;
        boolean isTrue = false;
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        while (i<n && !isTrue){
            int j = 0;
            while (j<m){
                if(matrix[i][j]==1){
                  isTrue=true;
                }
                j++;
            }
            i++;
        }
        if(isTrue){
            System.out.println("The number of columns of the submatrix is" + " " + columns);
            System.out.println("The number of rows of the submatrix is" + " " + rows);
        }else{
            System.out.print("There is no submatrix");
        }
    }
}
