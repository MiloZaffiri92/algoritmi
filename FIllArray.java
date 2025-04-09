import java.util.Arrays;
import java.util.Scanner;

public class FIllArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Grandezza dell'array: ");
        int[] array = new int[scanner.nextInt()];
        int i = 0;
        do {
            System.out.println("Numero da inserire: ");
            array[i] = scanner.nextInt();
            i++;
        }while (i < array.length);

        System.out.println(Arrays.toString(array));
        scanner.close();
    }
}
