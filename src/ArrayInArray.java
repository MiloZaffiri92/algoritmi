import java.util.Arrays;

public class ArrayInArray {
        public static void main(String[] args) {

            int[] grande = {1, 2, 3, 4, 5, 6};
            int[] piccolo = {3, 4, 5};

            boolean trovato = false;

            int i = 0;
            while (i <= grande.length - piccolo.length && !trovato) {
                int j = 0;
                while (j < piccolo.length && grande[i + j] == piccolo[j]) {
                    j++;
                }
                if (j == piccolo.length) {
                    trovato = true;
                }
                i++;
            }
            System.out.println("Vettore grande:  " + Arrays.toString(grande));
            System.out.println("Vettore piccolo: " + Arrays.toString(piccolo));
            System.out.println("Presente? " + trovato);
        }
    }