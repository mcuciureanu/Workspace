import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        menu();
    }

    static void menu(){
        boolean printMenu = true;

        do{
            Scanner in = new Scanner(System.in);
            int option = 0;
            Menu.printMenu();

            System.out.print("Select option: ");

            while((option < 1) || (option > 6)){
                option = Validate.checkInteger(option);
                if((option < 1) || (option > 6))
                    System.out.print("Try to select a number between 1-6: ");
            }

            switch(option){
                case 1:
                    Menu.listWholeList();
                    break;
                case 2:
                    Menu.searchNameAndDisplay();
                    break;
                case 3:
                    Menu.createName();
                    break;
                case 4:
                    Menu.updateName();
                    break;
                case 5:
                    Menu.deleteName();
                    break;
                case 6:
                    printMenu = Menu.exitOption();
                    break;
                default:
                    System.out.println("Select a number between 1-6!");
                    break;
            }
        }while(printMenu == true);
    }

}
