import java.util.Scanner;

/**
 Se da un sir de numere. Sa se afiseze perechile de numere pentru care primul numar este mai mare decat al doilea.
 de ex pt 11 13 9 8 16 se va afisa   13 9 , 9 8
 */

public class Problema11 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Type the number of pairs ");
        int pairsNum = in.nextInt();
        int numbersNum = pairsNum * 2;

        int[] a = new int[numbersNum];

        for(int i = 0; i < numbersNum; i++){
            System.out.print("[" + i + "] = ");
            a[i] = in.nextInt();
        }

        System.out.println("The accepted pairs:");

        for(int i = 1; i < numbersNum; i = i + 2){
            if(a[i] < a[i-1]){
                System.out.println(a[i-1] + ", " + a[i]);
            }
        }
    }
}
