
// Dati 2 vettori V=[2,4,8,16] e V2=[3,6,9,12] crea un V3 che contiene il prodotto scalare dei 2 array
public class ProdottoScalareVettori {

    public static void main(String[] args) {

        int[] vettoreA =  new int[] {2,4,8,16};
        int[] vettoreB =  new int[] {3,6,9,12};

        int[] vettoreC = new int[1];

        int sommaProdotto = 0;
        int i = 0;
        while(i < vettoreA.length) {

            sommaProdotto += vettoreA[i] * vettoreB[i];
            i++;
        }
        vettoreC[0] = sommaProdotto;
        System.out.println("Il prodotto scalare dei 2 vettori è: " + vettoreC[0]);
    }
}
