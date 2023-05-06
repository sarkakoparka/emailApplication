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
    private int mailboxCapacity = 1000;
    private String alternativeEmail;
    private String email;

    // constructor
    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;


    // call a method asking for department -> return department
    this.department = setDepartment();
    System.out.println("Department: "+this.department);
    //call a method that returns generated random password
        this.password = randomPassword(actualPasswordLength);
        System.out.println("Your password is: "+ password);
    // e-mail syntax
       email = firstName.toLowerCase() + lastName.toLowerCase() + "@" +  department.toLowerCase() + "." + "company.com";

    }
// ask 4 dep.
    private String setDepartment() {
        System.out.println("New employee: " + firstName + " " + lastName + " " + "\nType department code :\n1 - sales \n2 - developers \n3 - marketing");
        Scanner in = new Scanner(System.in);
        int dep = in.nextInt();
        if (dep == 1) {
            return "Sales";
        } else if (dep == 2) {
            return "Developers";
        } else if (dep == 3) {
            return "Marketing";
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
    // set mailbox capacity
    public void setMailboxCapacity (int capacity){
        this.mailboxCapacity = capacity;
    }

    // set alternative email
    public void setAlternativeEmail (String alternateEmail) {
           this.alternativeEmail = alternateEmail;
    }
    // Change the password
    public void changePassword(String password){
        this.password=password;
    }

    //get mail capacity
    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternativeEmail() { return alternativeEmail; }
    public String getPassword() {return password; }

    //showInfo method

    public String showInfo() {
        return "NAME :" + firstName + " " + lastName +
                "\nCOMPANY E-MAIL ADRESS: " + email +
                "\nCAPACITY OF YOUR MAILBOX "+ mailboxCapacity + "MB";     }
}






