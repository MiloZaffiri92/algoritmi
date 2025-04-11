package src.src;

import java.util.Scanner;

public class MatrixNumCont {

    //data una matrice A quadrata mxm verificare che
    //è costituita da valori continui crescenti(0,1,2etc)
    //leggere da tastiera dimensioni m della matrice e caricarla



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci la grandezza delle righe e delle colonne: ");
        int m = scanner.nextInt();

        int[][] matrixA = new int[m][m];

        int i = 0;
        while(i < m){
            int j = 0;
            while(j < m){
                System.out.println("inserisci il valore nella posizione: "+i+" "+j);
                matrixA[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        i = 0;
        boolean continuo = true;


        while(i < m && continuo){
            int j = 0;
            while(j < m && continuo){
                int valoreAtteso = (i * m) +j;
                if(matrixA[i][j] != valoreAtteso){
                    continuo = false;
                }
                j++;
            }
            i++;
        }

        if(continuo){
            System.out.println("la matrice ha valori continui crescenti");
        }else{
            System.out.println("la matrice non ha valori continui crescenti");
        }

    }
}
