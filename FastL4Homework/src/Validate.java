import java.util.InputMismatchException;
import java.util.Scanner;

public class Validate extends Exception{

    static int checkInteger(int x){
        Scanner in = new Scanner(System.in);

        try{
            x = in.nextInt();
        }
        catch (InputMismatchException e){
            System.err.print("Mistyped! You should type a correct number. Try again: ");
        }

        return x;
    }

    static char checkChar(){
        Scanner in = new Scanner(System.in);
        boolean ok=true;
        char c = 0;
        while(ok) {

            c = in.next().charAt(0);

            if (c == 'm' || c == 'f') {
                ok = false;
            } else {
                System.err.println("Mistyped! You should type 'm' or 'f'. Try again.");
                System.out.print("Gender (m/f): ");
            }
        }
        return c;
    }

    //Overload
    static boolean checkChar(char c){
        if(((c >= 65) && (c <= 90)) || ((c >= 97) && (c <= 122)))
            return true;
        else
            return false;
    }

    static boolean checkString(String name){
        char characterCheck;
        boolean isChar = false;

        for(int i = 0; i < name.length(); i++){
            characterCheck = name.charAt(i);
            isChar = checkChar(characterCheck);

            if(isChar == true)
                continue;
            else
                break;
        }

        if(isChar == false){
            System.err.print("Mistyped! Must have only letters in the name! Try again: ");
        }

        return isChar;
    }
}
