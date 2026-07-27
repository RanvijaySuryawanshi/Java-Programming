import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.print("Reverse String: ");
        for (int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}