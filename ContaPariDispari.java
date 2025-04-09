
// Dato un vettore contare i numeri pari e dispari partendo dalla posizione 1
public class ContaPariDispari {

    public static void main(String[] args) {

        int[] vettore = new int[] {1,2,3,4,5,6,7,8,9};

        int contaPari = 0;
        int contaDispari = 0;
        int i = 1;
        while(i <= vettore.length) {

            if (vettore[i-1] % 2 == 0) {
                contaPari += 1;
            } else {
                contaDispari += 1;
            }

            i += 1;
        }

        System.out.println("Numeri dispari nel vettore: " + contaDispari);
        System.out.println("Numeri pari nel vettore: " + contaPari);


    }
}
