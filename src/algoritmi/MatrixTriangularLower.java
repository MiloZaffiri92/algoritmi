package src.algoritmi;

//Verificare se una matrice è triangolare inferiore
//Leggere la dimensione n della matrice
//Caricare la matrice M[nxn]
//Produrre la risposta con un messaggio


public class MatrixTriangularLower {
    public static void main(String[] args) {
        int[][] matrix = {
                {6,1,1},
                {5,2,1},
                {7,2,3}
        };
        int n = matrix.length;
        int i = 0;
        boolean isTrue = true;

        while(i<n){
            int j = n-1;
            while (j>i && isTrue){
                if(matrix[i][j]==1){
                    j=j-1;
                }else{
                    isTrue=false;
                }
            }
            i++;
        }
        System.out.print(isTrue);

    }

}
