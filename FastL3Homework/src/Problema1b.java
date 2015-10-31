import java.util.Scanner;

/**
 * Created by Mihai on 26.10.2015.
 */
public class Problema1b
{
    public static void main(String args[])
    {
        System.out.print("Type number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int numOfDigits = 0;

        while (a > 0)
        {
            a = a / 10;
            numOfDigits++;
        }

        if(numOfDigits != 0)
            System.out.println("Number of digits: " + numOfDigits);
        else
            System.out.println("Number of digits: 1");
    }
}