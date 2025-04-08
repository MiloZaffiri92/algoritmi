package src.algoritmi;
//Dato un'array v di dimension n, determina se l'array è palindromo
//v=[1,2,3,2,1]
//v=[1,2,3,4,1]

public class ArrayPalindrome {
    public static void main(String[] args) {
        int[] v = new int[]{1,2,3,2,1};
        boolean isTrue = true;
        int n = v.length;
        int i = 0;
        int j = n-1;

        while (i<n && isTrue == true){
            if(v[i]!=v[j]){
                isTrue=false;
            }else{
                i++;
                j= j-1;
            }
        }
        System.out.print(isTrue);
    }
}
