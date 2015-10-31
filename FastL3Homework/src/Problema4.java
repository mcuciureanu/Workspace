/*
 4 Se da un numar a.
 Se se afiseze un numar b format doar din numerele impare ale numarului a, si un numar c format din patratul numerelor pare ale numarului a.
 */
import java.util.Scanner;

public class Problema4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Type a number: ");
        int a = in.nextInt();

        int digit, oddNum = 0, evenNum = 0;
        int evenPosition = 1, oddPosition = 1;

        while(a > 0)
        {
            digit = a % 10;
            a = a / 10;

            if(digit % 2 == 0){
                evenNum = evenNum + (digit * evenPosition);
                evenPosition = evenPosition * 10;
            } else{
                oddNum = oddNum + (digit * oddPosition);
                oddPosition = oddPosition * 10;
            }
        }

        System.out.println("The even number: " + evenNum +
                "\nThe even number ^2: " + (evenNum * evenNum)+
                "\nThe odd number: " + oddNum);
    }
}
