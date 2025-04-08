package src.algoritmi;
//Verificare che una matrice quadrata di numeri, A[nxn],
//contenga solo 1 sulla diagonale principale e sull'antidiagonale e i valori al di fuori della diagonale
//siano 1 o 0
public class MatrixOneDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,0,1},
                {0,1,0},
                {1,0,1},
        };

        int n = matrix.length;
        boolean isTrue = true;

        int i = 0;

        while(i<n&&isTrue){
            int j = 0;
            while(j<n){
                if(i==j||j==n-1-i){
                    if(matrix[i][j]!=1){
                        isTrue = false;
                    }
                }else{
                    if(matrix[i][j]!=0&&matrix[i][j]!=1){
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
