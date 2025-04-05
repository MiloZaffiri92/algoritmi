import java.util.Arrays;

public class ArrayAllDifferentIndex {
        public static void main(String[] args) {

            int[] v = {1, 2, 3, 4, 5};
//            int[] v = {1,2,3,4,2};

            boolean tuttiDiversi = true;

            int i = 0;
            while (i < v.length - 1 && tuttiDiversi) {
                int j = i + 1;
                while (j < v.length) {
                    if (v[i] == v[j]) {
                        tuttiDiversi = false;
                        break; // Appena trovi un duplicato, puoi fermarti
                    }
                    j++;
                }
                i++;
            }

            System.out.println("Array: " + Arrays.toString(v));
            System.out.println("Tutti diversi? " + tuttiDiversi);
        }
    }



