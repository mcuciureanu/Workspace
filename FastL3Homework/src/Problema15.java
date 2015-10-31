/*
 15. Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.
 */

import java.util.Scanner;

public class Problema15 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Type the array length: ");
        int arrayLength= in.nextInt();

        int[] a = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            System.out.print("[" + i + "] = ");
            a[i] = in.nextInt();
        }

        System.out.print("Type the values between which it will form a new array." +
                "\nFirst value:");
        int num1 = in.nextInt();
        System.out.print("Second value:");
        int num2 = in.nextInt();

        int firstElem, secondElem;

        if(num1 < num2){
            firstElem = num1;
            secondElem = num2;
        }else{
            firstElem = num2;
            secondElem = num1;
        }

        int correctNum = 0;

        for(int i = 0; i < arrayLength; i++) {
            if(a[i] > firstElem && a[i] < secondElem)
            {
                correctNum++;
            }
        }

        int[] newArray = new int[correctNum];
        int j = 0;

        for(int i = 0; i < arrayLength; i++) {
            if(a[i] > firstElem && a[i] < secondElem)
            {
                newArray[j] = a[i];
                j++;
            }
        }

        System.out.print("The new array: \n");

        for(int i = 0; i < correctNum; i++) {
            if(i != (correctNum-1))
                System.out.print(newArray[i] + ", ");
            else
                System.out.print(newArray[i] + ".");
        }
    }
}
