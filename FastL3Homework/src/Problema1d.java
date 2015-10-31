import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Mihai on 27.10.2015.
 */
public class Problema1d {
    public static void main(String args[])
    {
        System.out.print("Type number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int digit;
        int sumOfDigits;
        int newNumber = a;

        if(newNumber < 10){
            System.out.println("Cifra de control: " + newNumber);
        }
        else{
            while (newNumber >= 10){
                sumOfDigits = 0;
                while (newNumber > 0){
                    digit = newNumber % 10;
                    newNumber = newNumber / 10;

                    sumOfDigits = sumOfDigits + digit;
                }
                newNumber = sumOfDigits;
                System.out.println(newNumber);
            }

            System.out.print("Cifra de control a numarului " + a + " este " + newNumber + ".");
        }
    }
}
