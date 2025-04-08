package src.algoritmi;
//        Dato un' array, determina se ogni indice pari contiene un numero pari
//        e se ogni indice dispari contiene un numero dispari
//        dove 0 = pari
//        dove v=[0,1,2,3,4,5,6,7]
//        dove v=[1,1,2,3,4,5,6,7,8]
//        dove v=[0]
//        dove v=[]
public class ArrayOddEvenIndex {
    public static void main(String[] args) {
            int[] v = new int[]{};
            int n= v.length;
            if(n>0){
                int i = 0;
                boolean isTrue = true;

                while(i<n && isTrue==true){
                    if(i%2==0){
                        if(v[i]%2!=0){
                            isTrue = false;
                        } else {
                            isTrue = true;
                        }
                    } else {
                        if(v[i]%2==0){
                            isTrue = false;
                        }else {
                            isTrue = true;
                        }
                    }
                    i++;
                }
                System.out.print(isTrue);
            }
    }
}
