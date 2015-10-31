import java.util.Scanner;

/**
 * Created by Mihai on 26.10.2015.
 */

public class Problema1c {

    public static void main(String args[]) {

        System.out.print("Type number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int digit;
        int max = 0;
        int min = 0;

        while(a > 0) {
            digit = a % 10;
            a = a / 10;

            if(max == 0) {
                min = digit;
            }

            if(digit > max) {
                max = digit;
            }

            if(digit < min) {
                min = digit;
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
