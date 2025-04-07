public class IdentityMatrix {
    public static void main(String[] args) {
//        Algoritmo che verifichi se una matrice è identità (tutti 1 sulla diagonale principale e tutti 0 altrove)
        int[][] matrix = new int[][] {
                {1,1,0},
                {0,1,0},
                {0,0,1}
        };

        boolean identity = true;
        int i = 0;
        while (i < matrix.length && identity) {
            int j = 0;
            while(j < matrix[i].length && identity) {
            if(matrix[i] == matrix[j]) {
                if(matrix[i][j] != 1) {
                    identity = false;
                }
            } else {
                if(matrix[i][j] != 0) {
                    identity = false;
                }
            }
            j++;
            }
            i++;
        }
        System.out.println(identity);
    }
}
