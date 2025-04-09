
// Dato un vettore determina se il valore di ogni elemento corrisponda al valore del suo indice
public class CorrispondenzaPosizione {

    public static void main(String[] args) {

        // int[] vettore = new int[] {0,1,2,3,4,5};
        int[] vettore = new int[] {0,1,1,3,4,5};

        boolean corrisponde = true;

        int i = 0;

        while(i < vettore.length && corrisponde) {

            if(vettore[i] != i) {
                corrisponde = false;
            }
            i += 1;
        }

        System.out.println(corrisponde);
    }
}
