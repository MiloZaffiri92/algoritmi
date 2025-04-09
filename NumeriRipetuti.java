
// Dato un vettore[1,1,2,1,2,0,2] determinare se ci sono numeri ripetuti
public class NumeriRipetuti {

    public static void main(String[] args) {

        int[] vettore = new int[] {1,1,2,1,2,0,2};

        boolean ripetuto = false;

        int i = 0;

        while(i < vettore.length && !ripetuto) {

            int j = i + 1;
            while (j < vettore.length && !ripetuto) {

                if (vettore[i] == vettore[j]) {
                    ripetuto = true;
                }
                j += 1;
            }

            i += 1;
        }

        System.out.println(ripetuto);
    }
}
