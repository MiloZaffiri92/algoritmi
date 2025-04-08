package src.algoritmi;
//Verificare che due matrici siano uguali
//Leggere le dimensioni n ed m
//Caricare la matrice A[nxm] e B[nxm]
//Dire se le matrici sono uguali o no con un messaggio
//A={
//        {1,2,3},
//        {4,5,6}
//        }
//B={
//        {1,2,3},
//        {4,5,6}
//        }
public class MatrixEqual {

    public static void main(String[] args) {
        int[][] matrixA={
            {1,2,3},
            {4,5,6}
        };

        int[][] matrixB={
                {1,2,3},
                {4,5,6}
        };

        int nA = matrixA.length;
        int mA = matrixA[0].length;
        int nB = matrixB.length;
        int mB = matrixB[0].length;

        int i = 0;
        boolean isTrue = true;
        if(nA == nB && mA == mB){

            while (i<nA && isTrue == true){
                int j = 0;
                while (j<mA){
                    if(matrixA[i][j]==matrixB[i][j]){
                        j++;
                    }else {
                        isTrue=false;
                        j++;
                    }
                }
                i++;
            }
            if(isTrue){
                System.out.print("The two matrices are equal");

            }else{
                System.out.print("The two matrices are NOT equal");
            }

        }
    }
}
