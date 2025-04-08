package src.algoritmi;
//Verifica che una matrice abbia tutti 1 sulla prima colonna e tutti 0 altrove
//Leggi le dimensioni n ed m e carica la matrice M[nxm]
//Produci la risposta
public class MatrixFirstColumn {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0},
                {1, 0, 0},
                {1, 0, 0}
        };

        int i = 0;
        boolean isTrue = true;
        int n = matrix.length;
        int m = matrix[0].length;

        while(i<n&&isTrue) {
            int j = 0;
            while (j<m){
                if(j==0){
                    if(matrix[i][j]!=1){
                        isTrue = false;
                    }
                }else {
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
