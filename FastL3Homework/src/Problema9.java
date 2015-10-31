//9. Se dau doua numere a si n. sa se afiseze numarul a la puterea n

import java.util.Scanner;

public class Problema9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Type number: ");
        int n = in.nextInt();
        System.out.print("          ^: ");
        int m = in.nextInt();

        int prod = 1;

        for (int i = 0; i < m; i++){
           prod = prod * n;
        }

        System.out.println(n + " ^" + m + " = " + prod);
    }
}
