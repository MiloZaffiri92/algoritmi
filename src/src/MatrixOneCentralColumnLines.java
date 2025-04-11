package src.src;

public class MatrixOneCentralColumnLines {

    public static void main(String[] args) {

        int[][] matrix  = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0}
        };
        int m = matrix.length;
        //controllo che m sia dispari

        if(m % 2 !=0){

            int mid = m/2;
            int i = 0;
            boolean valid = true;
            while(i < m && valid){
                int j = 0;
                while(j < m && valid){
                    if(i == mid || j == mid){
                        if(matrix[i][j] != 1){
                            valid = false;
                        }
                    }else{
                        if(matrix[i][j] != 0){
                            valid = false;
                        }
                    }
                    j++;
                }
                i++;
            }
            if(valid){
                System.out.println("la matrice ha valori 1 nella colonna e riga centrale e 0 altrove");
            }else{
                System.out.println("la matrice non ha valori 1 sulla colonna centrale o 0 altrove");
            }
        }else{
            System.out.println("la matrice deve avere un numero di colonne e righe dispari");
        }



    }
}
