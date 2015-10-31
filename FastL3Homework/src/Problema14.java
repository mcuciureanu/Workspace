import java.util.Scanner;

/**
 Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate, iar pentru a doua jumatate
    sa se afseze numerele triplate daca sunt impare si numerele asa cum sunt in sir daca sunt pare.
 */

public class Problema14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Array length: ");
        int n = in.nextInt();

        int[] a = new int[n];

        //assignment
        for(int i = 0; i < n; i++){
            System.out.print("[" + i + "] = ");
            int nr = in.nextInt();

            if(i <= (n/2)){
                a[i] = nr * 2;
            }else{
                if(nr % 2 != 0){
                    a[i] = nr * 3;
                }else{
                    a[i] = nr;
                }
            }
        }

        System.out.println("The array modified:");

        //display
        for(int i = 0; i < n; i++){
            if(i != (n-1))
                System.out.print(a[i] + ", ");
            else
                System.out.print(a[i] + ".");
        }
    }
}
