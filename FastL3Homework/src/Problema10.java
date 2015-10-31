import java.util.Scanner;

/**
 10.Sa se calculeze factorialul unui numar a
 */

public class Problema10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Your number: ");
        int n = in.nextInt();
        int prod = 1;

        for(int i = 1; i <= n; i++){
            System.out.println(i + "*");
            prod = prod * i;
        }

        System.out.print("_____ \n" + prod);
    }
}
