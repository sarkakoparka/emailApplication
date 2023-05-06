package EmailApp;

public class Application {
    public static void main (String[] args){
        Email testEmail = new Email("Sara", "Panek", "Dev");
        System.out.println(testEmail.showInfo());
    }
}
