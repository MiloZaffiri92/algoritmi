package src.algoritmi;

//Dato V = [1,2,3,4,5,,6,7], determina se ogni valore dell'array corrisponde al valore del suo indice
public class ArrayValue {
    public static void main(String[] args) {

        int[] v = new int[]{1,2,3,4,5,6,7};


        boolean isTrue= true;
         int i = 0;
        while (i < v.length && isTrue){
            if(v[i]!=i){
                isTrue=false;
            }else{
                i++;
            }
        }
        System.out.print(isTrue);
    }
}
