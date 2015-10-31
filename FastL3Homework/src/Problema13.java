/**
 * 13. Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este sa se ordoneze si sa se afiseze in ordine crescatoare
 de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}  si va ordina si afisa {2,3,4}
 */
import java.util.Scanner;

public class Problema13{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Type the array length: ");
        int arrayLength = in.nextInt();

        int[] a = new int[arrayLength];
        boolean ascending = true;

        for (int i = 0; i < arrayLength; i++){
            System.out.print("[" + i + "] = ");
            a[i] = in.nextInt();

            if((i > 0) && (a[i] <= a[i-1])){
                ascending = false;
            }
        }

        if(ascending){
            System.out.println("\ncrescator");
        }
        else {
            for (int i = 0; i < arrayLength; ) {
                if ((i > 0) && (a[i] < a[i - 1])) {
                    int change;
                    change = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = change;
                    i--;
                } else {
                    i++;
                }
            }

            //display
            System.out.println("\nThe new array: ");

            for (int i = 0; i < arrayLength; i++) {
                if (i != (arrayLength - 1))
                    System.out.print(a[i] + ", ");
                else
                    System.out.print(a[i] + ".");
            }
        }
    }
}
