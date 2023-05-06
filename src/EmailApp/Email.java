package EmailApp;
        /*Your application should do the following:
     Generate an email with the following syntax: firstname.lastname@department.company.com
     Determine the department (sales, development, accounting), if none leave blank
     Generate a random String for a password
     Have set methods to change the password, set the mailbox capacity, and define an alternate
    email address
     Have get methods to display the name, email, and mailbox capacity*/

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int actualPasswordLength = 10;
    private int mailboxCapacity;
    private String alternativeEmail;
    private String email;

    // constructor
    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        System.out.println("E-mail created: " + this.firstName + "." + this.lastName + ".company.com");

    // call a method asking for department -> return department
    this.department = setDepartment();
    System.out.println("Department: "+this.department);
    //call a method that returns generated random password
        this.password = randomPassword(actualPasswordLength);
        System.out.println("Your password is: "+ password);
    // e-mail syntax
       email = firstName.toLowerCase() + lastName.toLowerCase() + "@" +  department.toLowerCase() + "." + "company.com";
        System.out.println(" Your email: " + email);
    }
// ask 4 dep.
    private String setDepartment() {
        System.out.println("Type for dep:/n1 - sales /n2 - developers /n3 - marketing");
        Scanner in = new Scanner(System.in);
        int dep = in.nextInt();
        if (dep == 1) {
            return "sales";
        } else if (dep == 2) {
            return "developers";
        } else if (dep == 3) {
            return "marketing";
        } else {
            return "nothing to show";
        }
    }

    // generate random password
    private String randomPassword( int length ){
        String passwd = "abcdefghijklmnoprstwxyzABCDEFGHIJKLMNOPRSTUWXYZ1234567890!@#$%^&*()";
        char[] password = new char [length];
        for (int i=0; i< length; i++){
            int random = (int) (Math.random()*passwd.length());
            password[i]= passwd.charAt(random);
        }
        return new String (password);
    }

}

    //generate random password
    /*private class passwordGenerator{

    String lowerCase = "abcdefghijklmnoprstuwxyzźż";
    String upperCase= "ABCDEFGHIJKLMNOPRSTUWXYZŹŻ";
    String numeros = "0123456789";
    String specialCharacter = "<>!@#$%^&*(){}[]/|,.";

    String pswdSyntax=specialCharacter+lowerCase+upperCase+numeros;
    int lenght ;
    char [] passwd = new char [lenght];
    Random random = new Random();
    for (int i = 0 ; i< lenght; i++) {
        passwd[i]=pswdSyntax.charAt(random.nextInt(pswdSyntax)));

        }
    System.out.println("Generated password: "+new String(passwd));

       } */

    //set method to change the password
    //set mailbox capacity
    //alternative e-mail
    //get to display the name, email and capacity of mailbox




