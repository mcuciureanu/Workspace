import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static ArrayList<Person> ListOfPersons = new ArrayList<Person>();

    public static void printMenu(){
        System.out.println("\t\t\t\t __________________________");
        System.out.println("\t\t\t\t\t\t    MENU" +
                "\n\t\t\t\t 1. List whole list" +
                "\n\t\t\t\t 2. Search name and display" +
                "\n\t\t\t\t 3. Create name" +
                "\n\t\t\t\t 4. Update name" +
                "\n\t\t\t\t 5. Delete name" +
                "\n\t\t\t\t 6. Exit Menu");
        System.out.println("\t\t\t\t __________________________");
    }

    public static void listWholeList(){
        // if the list is empty
        if(ListOfPersons.size() == 0){
            System.out.println("  - The list is empty. -");
        }
        // if the list is NOT empty
        else {
            for (int i = 0; i < ListOfPersons.size(); i++) {
                System.out.println("Name: " + ListOfPersons.get(i).getFirstName() + " " +
                        ListOfPersons.get(i).getLastName() + "/ " +
                        "Gender: " + ListOfPersons.get(i).getGender() + "/ " +
                        "Age: " + ListOfPersons.get(i).getAge());
            }
        }
    }

    //Overload
    public static void listWholeList(int index){

        for(int i = 0 ; i < ListOfPersons.size(); i++){
            if(i == index) {
                System.out.println("Name: " + ListOfPersons.get(i).getFirstName() + " " +
                        ListOfPersons.get(i).getLastName() + "/ " +
                        "Gender: " + ListOfPersons.get(i).getGender() + "/ " +
                        "Age: " + ListOfPersons.get(i).getAge());
            }
        }
    }

    public static int searchNameAndDisplay(){
        Scanner in = new Scanner(System.in);

        System.out.print("Type the searched name: ");
        String searchedName = in.nextLine().toUpperCase();

        for(int i = 0 ; i < ListOfPersons.size(); i++){
            // search by first name
            if (searchedName.contentEquals(ListOfPersons.get(i).getFirstName())) {
                // send to the listWholeList the index where the searched person can be found
                listWholeList(i);
                return i;
            }
            // search by last name
            else if (searchedName.contentEquals(ListOfPersons.get(i).getLastName())) {
                // send to the listWholeList the index where the searched person can be found
                listWholeList(i);
                return i;
            }
        }
        return 0;
    }

    public static void createName(){
        Scanner in = new Scanner(System.in);

        String firstName = "", lastName = "";
        char gender;
        int age = -1;
        boolean isCharString = false;

        System.out.print("First name: ");

        while(isCharString == false) {
            firstName = in.nextLine().toUpperCase();
            isCharString = Validate.checkString(firstName);
        }

        isCharString = false;
        System.out.print("Last name: ");

        while(isCharString == false) {
            lastName = in.nextLine().toUpperCase();
            isCharString = Validate.checkString(lastName);
        }

        System.out.print("Gender (m/f): ");
        gender = Validate.checkChar();

        System.out.print("Age: ");

        while(age < 0 || age > 120){
            age = Validate.checkInteger(age);
        }

        if(age != 0){
            Person p = new Person(firstName, lastName, gender, age);
            ListOfPersons.add(p);
        }else{
            Person p = new Person(firstName, lastName, gender);
            ListOfPersons.add(p);
        }
    }

    public static void updateName(){
        int index = searchNameAndDisplay();

        Scanner in = new Scanner(System.in);

        System.out.println("Change the name of the person: ");

        System.out.print("Firs name: ");
        String firstName = in.nextLine();

        System.out.print("Second name: ");
        String lastName = in.nextLine();

        ListOfPersons.get(index).setFirstName(firstName);
        ListOfPersons.get(index).setLastName(lastName);
    }

    public static void deleteName(){
        int index = searchNameAndDisplay();

        ListOfPersons.remove(index);

        System.out.println("The person was deleted.");
    }

    public static boolean exitOption(){
        System.out.println("\n\t\t\t\t\t\tMENU CLOSED");
        return false;
    }

}
