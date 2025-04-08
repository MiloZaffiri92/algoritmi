package src.algoritmi;
//Data una matrice A, verificare che essa sia quadrata e di ordine N dispari e che
//solo e soltanto tutti gli elementi nella riga e colonna centrali siano diversi da 0. In caso affermativo
//calcolare il massimo e il minimo dei suoi elementi
public class MatrixMaxMin {
    public static void main(String[] args) {
        int[][] matrix={
                {0,0,77,0,0},
                {0,0,-12,0,0},
                {2,88,-8,9,99},
                {0,0,31,0,0},
                {0,0,40,0,0},
        };
        int n = matrix.length;
        int m = matrix[0].length;

        if(n==m&&n%2==1){
            int middle = (n-1)/2;
            int i = middle;
            int min = matrix[i][middle];
            int max = matrix[i][middle];
            while (i<n){
                int j = middle;
                while (j<n){
                    if(matrix[i][j]!=1){
                        if(matrix[i][j]<min){
                            min = matrix[i][j];
                        }else if(matrix[i][j]>max){
                            max = matrix[i][j];
                        }
                    }
                    j++;
                }
                i++;
            }
            System.out.println("The maximum is" + " " + max);
            System.out.println("The minimum is" + " "  + min);
        }
    }
}
