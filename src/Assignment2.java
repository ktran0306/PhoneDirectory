//Assignment2.java

//Stores names and telephone numbers and allows phone
//numbers to be looked up.The user is given a menu of 3 commands:
//
// a- add a new phone number
// f- find a phone number
// q- quit
//
//The "f" command prompts the user to enter a name;
//the program then displays all matching names in the database,
//along with the corresponding phone numbers. It is not
//necessary to enter the entire name; all names that begin
//with the specified characters will be displayed. The "f"
//command ignores the case of letters when looking for
//matching names.
//
//The "q" command causes the program to terminate. All names
// and numbers are lost.
import java.util.Scanner;
import java.util.Locale;
import java.lang.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        //Create a PhoneDirectory object
        PhoneDirectory pd = new PhoneDirectory();
        //numRecords indicate how many records in the array
        //as well as what is the next available position in the array
        int numRecords = 0;

        //Display list of commands
        System.out.println("Phone directory commands:\n" +
                " a - Add a new phone number\n" +
                " f - Find a phone number\n" +
                " q - Quit\n");
        //Read and execute commands
        while (true) {

            //Prompt user to enter a command
            System.out.print("Enter command (a, f, or q): ");
            String command = scan1.next();

            //Determine whether command is "a","f","q", or
            //illegal; execute command if legal.
            if (command.equalsIgnoreCase("a")) {

                //Command is "a". Prompt user for name and number,
                //then create a phone record and store it in the
                //database.
                    System.out.print("Enter new name: ");
                    String name = scan2.nextLine().trim();
                    System.out.print("Enter new phone number: ");
                    String number = scan2.nextLine().trim();
                    pd.enterPhoneRecords(name,number);
                    numRecords++;

            }  else if (command.equalsIgnoreCase("f")) {
                // Command is "f". Prompt user for search key.
                // Search the database for records whose names begin
                // with the search key. Print these names and the
                // corresponding phone numbers.
                System.out.print("Enter name to look up: ");
                String key = scan2.nextLine().trim().toLowerCase();
                pd.findPhoneRecord(key);

            } else if (command.equalsIgnoreCase("q")) {
                // Command is "q". Terminate program.
                return;
            } else {
                // Command is illegal. Display message.
                System.out.println("Command was not recognized; " + "please enter only a, f, or q");
            }
            System.out.println();
        }
    }
}
