package EmailApp;
        /*Your application should do the following:
     Generate an email with the following syntax: firstname.lastname@department.company.com
     Determine the department (sales, development, accounting), if none leave blank
     Generate a random String for a password
     Have set methods to change the password, set the mailbox capacity, and define an alternate
    email address
     Have get methods to display the name, email, and mailbox capacity*/

import java.util.Scanner;

public class Email {
   private String firstName;
    private String lastName;
   private String department;
   private String pswd;
   private int mailboxCapacity;
   private String alternativeEmail;

   public Email (String firstName,String lastName){
       this.firstName=firstName;
       this.lastName=lastName;
       this.department=department();
       System.out.println("E-mail created: "+ this.firstName + "."+ this.lastName + "@" +department+".company.com");
   }
   String department (){
       System.out.println("Type for dep:/n1 - sales /n2 - dev /n3 - marketing");
       Scanner in = new Scanner(System.in);
       int dep = in.nextInt();
       if (dep == 1){return "sales";}
       else if (dep ==2 ){ return "dev"; }
       else if (dep == 3){ return "marketing";}
       else {return "none";}

   }

   // generate e-mail with following syntax

    // determine the dep

    //generate random password
    //set method to change the password
    //set mailbox capacity
    //alternative e-mail
    //get to display the name, email and capacity of mailbox



}
