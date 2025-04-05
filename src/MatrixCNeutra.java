import java.util.Scanner;
import java.util.Arrays;

    public class MatrixCNeutra {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

//            int A[][] = {
//                    {1,2},
//                    {3,4}
//            };
//            int B[][] = {
//                    {-1,-2},
//                    {-3,-4}
//            };
//
//            int n = A.length;
//            int m = A[0].length;
//
////
//            System.out.print("Inserisci numero di righe: ");
//            int righe = scanner.nextInt();
//
//            System.out.print("Inserisci numero di colonne: ");
//            int colonne = scanner.nextInt();
//
//
//            int[][] A = new int[righe][colonne];
//            System.out.println("Inserisci i valori della matrice A:");
//            int i = 0;
//            while (i < righe) {
//                int j = 0;
//                while (j < colonne) {
//                    System.out.print("A[" + i + "][" + j + "]: ");
//                    A[i][j] = scanner.nextInt();
//                    j++;
//                }
//                i++;
//            }
//
//            int[][] B = new int[righe][colonne];
//            System.out.println("Inserisci i valori della matrice B:");
//            i = 0;
//            while (i < righe) {
//                int j = 0;
//                while (j < colonne) {
//                    System.out.print("B[" + i + "][" + j + "]: ");
//                    B[i][j] = scanner.nextInt();
//                    j++;
//                }
//                i++;
//            }
//
//            boolean matriceNulla = true;
//            i = 0;
//            while (i < n && matriceNulla) {
//                int j = 0;
//                while (j < m) {
//                    if (A[i][j] + B[i][j] != 0) {
//                        matriceNulla = false;
//                        break;
//                    }
//                    j++;
//                }
//                i++;
//            }
//
//
//            System.out.println("Matrice A:");
//            i = 0;
//            while (i < n) {
//                System.out.println(Arrays.toString(A[i]));
//                i++;
//            }
//            System.out.println("Matrice B:");
//            i = 0;
//            while (i < n) {
//                System.out.println(Arrays.toString(B[i]));
//                i++;
//            }
//            System.out.println("La somma è una matrice nulla? " + matriceNulla);


            /*__________________________________________________________________________*/


            System.out.print("Inserisci numero di righe: ");
            int righe = scanner.nextInt();

            System.out.print("Inserisci numero di colonne: ");
            int colonne = scanner.nextInt();


            int[][] A = new int[righe][colonne];
            System.out.println("Inserisci i valori della matrice A:");
            int i = 0;
            while (i < righe) {
                int j = 0;
                while (j < colonne) {
                    System.out.print("A[" + i + "][" + j + "]: ");
                    A[i][j] = scanner.nextInt();
                    j++;
                }
                i++;
            }

            int[][] B = new int[righe][colonne];
            System.out.println("Inserisci i valori della matrice B:");
            i = 0;
            while (i < righe) {
                int j = 0;
                while (j < colonne) {
                    System.out.print("B[" + i + "][" + j + "]: ");
                    B[i][j] = scanner.nextInt();
                    j++;
                }
                i++;
            }

            boolean matriceNulla = true;
            i = 0;
            while (i < righe && matriceNulla) {
                int j = 0;
                while (j < colonne) {
                    if (A[i][j] + B[i][j] != 0) {
                        matriceNulla = false;
                        break;
                    }
                    j++;
                }
                i++;
            }


            System.out.println("Matrice A:");
            i = 0;
            while (i < righe) {
                System.out.println(Arrays.toString(A[i]));
                i++;
            }
            System.out.println("Matrice B:");
            i = 0;
            while (i < righe) {
                System.out.println(Arrays.toString(B[i]));
                i++;
            }
            System.out.println("La somma è una matrice nulla? " + matriceNulla);


        }
    }


