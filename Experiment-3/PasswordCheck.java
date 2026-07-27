import java.util.Scanner;
public class PasswordCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pass = "Ranvijay@2008";
        System.out.print("Enter Password: ");
        String user = sc.nextLine();
        if(user.equals(pass))
            System.out.println("Correct Password");
        else
            System.out.println("Wrong Password");
        sc.close();
    }
}