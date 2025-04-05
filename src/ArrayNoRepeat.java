import java.util.Arrays;

public class ArrayNoRepeat {
        public static void main(String[] args) {

            int[] array = {3, 1, 6, 2, 5, 3, 6, 4, 4};
            int[] u = new int[array.length];
            int indice = 0;

            int i = 0;
            while (i < array.length) {
                boolean trovato = false;

                int j = 0;
                while (j < indice) {
                    if (array[i] == u[j]) {
                        trovato = true;
                        break;
                    }
                    j++;
                }

                if (!trovato) {
                    u[indice] = array[i];
                    indice++;
                }

                i++;
            }


            u = Arrays.copyOf(u, indice);

            System.out.println("Array originale:      " + Arrays.toString(array));
            System.out.println("Senza numeri ripetuti:" + Arrays.toString(u));
        }






}

