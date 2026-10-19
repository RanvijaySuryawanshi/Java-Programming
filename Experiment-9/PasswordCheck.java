import java.util.Scanner;
public class PasswordCheck {
    public static void main (String[] args) {
         Scanner sc  = new Scanner (System.in) ;
         System.out.println ( "Enter Password :  " );
         String password = sc.nextLine();
         try {
              if (!password.equals("12345")) {
                  throw new Exception("Authentication Failure!");
              }
              System.out.println("Authentication Successful!");
         }
         catch (Exception e ) {
              System.out.println(e.getMessage());
         }
    }
}
