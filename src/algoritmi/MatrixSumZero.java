package src.algoritmi;
//Verificare che due matrici date A[nxm] e B[nxm], siano tali che la loro somma è pari ad una matrice nulla
//Restituire un valore booleano che esprima il risultato
public class MatrixSumZero {
    public static void main(String[] args) {
        int[][] matrixA={
                {1,2,3},
                {4,5,6},
                {7,8,8},
        };
        int[][] matrixB={
                {-1,-2,-3},
                {-4,-5,-6},
                {-7,-8,-8},
        };
        boolean isTrue = true;
        int i = 0;
        int n = matrixA.length;
        int m = matrixA[0].length;

        while(i<n&&isTrue){
            int j= 0;
            while (j<m){
                int sum = matrixA[i][j] + matrixB[i][j];
                if(sum != 0){
                    isTrue = false;
                }
                j++;
            }
            i++;
        }
        System.out.print(isTrue);
    }

}
