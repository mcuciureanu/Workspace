import java.util.Scanner;

/**
 * Created by Mihai on 27.10.2015.
 */
public class Problema3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Type a number: ");
        int a = in.nextInt();

        int aCopy = a, aSecondCopy = a;
        int position = 1, digit, newNumber = 0;

        while(aCopy > 0){
            aCopy = aCopy / 10;
            position = position * 10;
        }

        while(a > 0){
            position = position / 10;
            digit = a % 10;
            a = a / 10;
            newNumber = newNumber + (digit * position);
        }

        if(newNumber == aSecondCopy)
            System.out.println("Numarul este palindrom.");
        else
            System.out.println("Numarul NU este palindrom.");
    }
}
