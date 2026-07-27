import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        String r = "";
        for (int i=s.length()-1; i>=0; i--) {
            r= r + s.charAt(i);
        }
        if (s.equals(r))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}