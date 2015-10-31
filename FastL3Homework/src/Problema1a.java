import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Mihai on 24.10.2015.
 *  Se da un numar natural a, de exemplu
 int a = 64321

 a) Sa se calculeze suma cifrelor numarului cat si produsul lor
 de ex pentru numarul de mai sus vom avea
 suma = 6+4+3+2+1
 produsul = 6*4*3*2*1

 b) sa se precizeze cate cifre are numarul citit
 de ex pentru numarul de mai sus
 cifre=5

 c) sa se precizeze cifra maxima si minima a numarului a

 d) sa se precizeze cifra de control a numarului a: se calculeaza suma cifrelor, si apoi suma cifrelor sumei si , si tot asa pana ramane o singura cifra care se numeste cifra de control

 Se va folosi notiunea din matematica conform careia restul impartirii la 10 il reprezinta ultima cifra a numarului iar catul numarul fara ultima cifra.
 asadar un posibil pseudocod ar fi:

 declar cifra a si ii atribui o valorea
 cat timp a diferit de zero
 cifra = a % 10
 //aici fac o prelucrarea , cerintele
 a = a/10
 end cat timp

 */
public class Problema1a
{
    public static void main(String args[])
    {
        System.out.print("Type number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.print("\nNumber of digits: ");
        System.out.println("\t\tProduct of digits: ");

        int digit;
        int sumOfDigits = 0;
        int prodOfDigits = 1;

        while(a > 0)
        {
            digit = a % 10;
            a = a / 10;

            sumOfDigits = sumOfDigits+ digit;
            System.out.print("\t" + digit + "+");

            prodOfDigits = prodOfDigits * digit;
            System.out.println("\t\t\t\t\t\t" + digit + "*");
        }

        System.out.println("_________________       __________________");
        System.out.print("\t" + sumOfDigits);
        System.out.print("\t\t\t\t\t\t" + prodOfDigits);
    }
}