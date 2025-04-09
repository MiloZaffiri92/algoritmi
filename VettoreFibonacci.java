import java.util.Arrays;
import java.util.Scanner;

// Vettore di n dimensioni riempirlo con la sequenza di fibonacci
public class VettoreFibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dimensione vettore: ");
        int[] vettore = new int[scanner.nextInt()];

        vettore[0] = 0;
        vettore[1] = 1;
        int i = 2;
        while (i < vettore.length) {

            vettore[i] = vettore[i-2] + vettore[i-1];

            i += 1;
        }

        System.out.println(Arrays.toString(vettore));
    }
}
