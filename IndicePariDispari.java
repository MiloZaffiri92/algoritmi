
// Dato un array determina se ogni indice contiene un numero pari, idem per indice
public class IndicePariDispari {

    public static void main(String[] args) {

        boolean uguale = true;

        int[] vettore = new int[] {6,3,8,7,4};
        // int[] vettore = new int[] {1,1,2,3,4};

        int i = 0;
        while(i < vettore.length && uguale) {

            if (i % 2 == 0) {
                if (vettore[i] % 2 != 0) {
                    uguale = false;
                }
            } else {
                if (vettore[i] % 2 == 0) {
                    uguale = false;
                }
            }

            i += 1;
        }

        System.out.println(uguale);

    }
}
