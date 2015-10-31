/**
 7. Se citesc numere naturale pân? când se introduce num?rul 0. Afisati suma obtinut? prin adunarea primei si a
 ultimei cifre din fiecare numar citit. Numerele cu mai putin de 2 cifre nu se iau in considerare.
 Exemplu: dac? se introduc numerele 3455 66 7 8 23 11221 0 atunci se va afisa 27 (3+5+6+6+2+3+1+1).
 */
import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = 1;
        int sum = 0, firstDigit = 0, lastDigit = 0, cifPosition;

        System.out.println("Type numbers");

        while(num != 0){
            num = in.nextInt();

            if(num > 99) {
                int numCopy = num;
                cifPosition = 0;

                while(numCopy > 0){
                    cifPosition++;

                    if(cifPosition == 1){
                        firstDigit = numCopy % 10;
                    }

                    lastDigit = numCopy % 10;
                    numCopy = numCopy / 10;
                }
                sum = sum + firstDigit + lastDigit;
            }
        }

        System.out.println("The sum is: " + sum);
    }
}
