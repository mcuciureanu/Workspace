/**
 Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24]. Altfel sa se afiseze ‘false'.
 */
import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Type number: ");
        int n = in.nextInt();
        boolean found = false;

        for(int i = 9; i <= 24; i++) {
            if(n == i){
                found = true;
            }
        }

        System.out.println(found);
    }
}
