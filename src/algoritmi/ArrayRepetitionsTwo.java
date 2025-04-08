package src.algoritmi;
//Determina se ci sono numeri ripetuti
//array = [1,1,2,1,2,0,2]
public class ArrayRepetitionsTwo {
    public static void main(String[] args) {
        int[] array = {1,1,2,1,2,0,2};
        int n = array.length;
        int i = 0;
        int j = n-1;
        boolean isTrue = false;
        while (i<n){
            while(j>0&&!isTrue){
                if(array[i]==array[j]){
                   isTrue = true;
                }else{
                    j = j-1;
                }
            }
            i++;
        }
        System.out.print(isTrue);
    }
}
