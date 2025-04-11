package src.src;

public class SubArray {
    // dato un vettore v1 confrontare se v2 sia un subvettore  di v1

    public static void main(String[] args) {
        int [] v1  = {0,2,4,6,7};
        int [] v2 = {2,4,6};
        //int [] v2 = {3,5};

        boolean sub = false;

        int i = 0;

        while(i < v1.length- v2.length && !sub){
            int j = 0 ;
            boolean uguali = true;
            while(j < v2.length && uguali){
                if(v1[i+j] != v2[j]){
                    uguali = false;
                }
                j++;
            }
            if(uguali){
                sub = true;
            }
            i++;
        }

        System.out.println(sub);
    }
}
