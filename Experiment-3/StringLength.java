import java.util.Scanner;
public class StringLength{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Number of Characters = " + s.length());
        sc.close();
    }
}