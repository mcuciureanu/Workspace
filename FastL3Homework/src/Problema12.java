/*
 12. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
 suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n .
 */
import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("The number: ");
        int x = in.nextInt();

        System.out.print("Raised up to power: ");
        int n = in.nextInt();

        System.out.print("The sum: ");

        int sum = 0, powerRaising;

        for(int i = 0; i <= n; i++){
            powerRaising = (int) Math.pow(x,i);

            if(i != n)
                System.out.print("(" + x + "^" + i + ") + ");
            else
                System.out.print("(" + x + "^" + i + ") = ");

            sum = sum + powerRaising;
        }

        System.out.print(sum);
    }
}
