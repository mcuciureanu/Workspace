/*
 6.Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
 int n = 20; //sau o alta valoare
 */
import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Your number: ");
        int n = in.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            System.out.println(i + "+");
            sum = sum + i;
        }

        System.out.print("_____ \n" + sum);
    }
}
