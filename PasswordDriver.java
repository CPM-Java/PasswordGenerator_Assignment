
/**
 * Driver for the PasswordMaker assignment.
 * 
 * @author GrayKnight CPM 2017 
 * @version 9/24/17
 */

import java.util.Scanner;

public class PasswordDriver
{
    private Scanner scan = new Scanner(System.in);
    
    /**
     * Manages the user interface for the password generator
     */
    public void passwordUI()
    {
        String verify = "y";
        while(verify.equals("y"))
        {
            System.out.print("Enter First Name:");
            String firstName = scan.nextLine();
            if(firstName.length() == 0) firstName = "John";
            System.out.print("Enter Last Name:");
            String lastName = scan.nextLine();
            if(lastName.length() <= 2) lastName = "Doe";
            
            Password pw = new Password(firstName, lastName);
            pw.generatePassword();
            System.out.println(pw);
            
            System.out.print("Another password? (y or n):");
            verify = scan.nextLine();
        }//end of while
        System.out.println("Goodbye!");
    }//end of method
}
