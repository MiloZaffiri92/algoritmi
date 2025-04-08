package src.algoritmi;

import java.util.Scanner;

//Verificare se valore Val è presente nel vettore
//Leggere n, caricare il vettore An
//Stampare "è presente" o "non è presente"
public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number:");

        int number = scanner.nextInt();

        int[] array = {1,3,7,5,6};

        int i = 0;
        int n = array.length;
        boolean isTrue = false;
        while(i<n&&!isTrue){
            if(number == array[i]){
                isTrue=true;
            }
            i++;

        }
        if(isTrue){
            System.out.print("The number is present");
        }else{
            System.out.print("The number is NOT present");
        }
    }
}
