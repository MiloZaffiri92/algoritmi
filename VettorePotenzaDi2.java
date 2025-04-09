import java.util.Arrays;
import java.util.Scanner;

// Riempi un vettore di n dimensioni con potenze di 2
public class VettorePotenzaDi2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dimensione vettore: ");
        int[] vettore = new int[scanner.nextInt()];

        vettore[0] = 1;
        int i = 1;

        while(i < vettore.length) {

            vettore[i] = vettore[i-1]*2;
            i++;
        }


        System.out.println(Arrays.toString(vettore));
    }

}
