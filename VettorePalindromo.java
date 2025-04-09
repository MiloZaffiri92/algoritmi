
// Dato un vettore di n dimensioni determinare che sia palindromo
public class VettorePalindromo {

    public static void main(String[] args) {

        boolean palindromo = true;
        int[] vettore = new int[] {1,2,3,2,1};
        // int[] vettore = new int[] {1,1,3,2,1};

        int i = 0;

        while(i < vettore.length/2 && palindromo) {

            if (vettore[i] != vettore[vettore.length-1-i]) {
                palindromo = false;
            }
            i++;
        }

        System.out.println("Il vettore è palindromo? " + palindromo);
    }
}
