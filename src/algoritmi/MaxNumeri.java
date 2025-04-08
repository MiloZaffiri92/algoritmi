package src.algoritmi;

import java.util.Scanner;

public class MaxNumeri {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int max = 0;
            int i = 0;

            System.out.println("Inserisci numero: ");

            while (i<5) {
                int numero = scanner.nextInt();
                if (numero> max){
                    max = numero;
                    i +=1;
                }else {
                    i +=1;
                };


            };
            System.out.println("il massimo è" + max);

        }
    }
