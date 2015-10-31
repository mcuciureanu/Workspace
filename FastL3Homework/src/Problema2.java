/*
 2. Se da un numar a. Se se afiseze numarul invers
 de ex
 int a = 476
 se va obtine
 int invers =674
 */

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Type a number: ");
        int a = in.nextInt();

        int aCopy = a;
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

        System.out.println("Oglindit: " + newNumber);
    }
}
