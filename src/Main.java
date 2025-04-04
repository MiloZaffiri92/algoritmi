import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        algoritmo1();
        algoritmo2();
        algoritmo3();
    }

    private static void algoritmo1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int num1 = scan.nextInt();
        System.out.println("inserisci un secondo numero");
        int num2 = scan.nextInt();
        int somma = num1 + num2;
        System.out.println("la somma é:" + somma);
    }

    private static void algoritmo2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int num3 = scan.nextInt();
        System.out.println("inserisci secondo numero");
        int num4 = scan.nextInt();
        if (num3 > num4) {
            System.out.println("il numero" + num3 + "é maggiore");
        } else {
            System.out.println("il numero" + num4 + "é maggiore");
        }
    }
    private static void algoritmo3 () {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci di quanti numeri vuoi fare la media");
        int n = scan.nextInt();
        int i = 0;
        int media = 0;
        int somma3 = 0;
        do {
            System.out.println("inserisci un numero");
            int num = scan.nextInt();
            somma3 = somma3 + num;
            i = i + 1;
        } while (i<n);
        media = somma3 / n;
        System.out.println("la media é" + media);
    }
}


