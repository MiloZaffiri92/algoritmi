package src.algoritmi;
//Verificare che una matrice sia bandata
public class MatrixBanded {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,1,1,1,0,0},
                {0,0,1,1,1,0},
                {0,0,0,1,1,1},
                {0,0,0,0,1,1},
        };

        int i = 0;
        boolean isBanded=true;
        int n = matrix.length;

        while (i<n){
            int j = 0;
            while(j<n){
                if(j==i||j==i+1||i==j+1){
                    if(matrix[i][j]!=1){
                        isBanded=false;
                    }
                }else{
                    if(matrix[i][j] !=0){
                        isBanded=false;
                    }
                }
                j++;
            }
            i++;
        }
        System.out.print(isBanded);

    }
}
