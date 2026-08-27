import java.util.Scanner;
public class StringToInt {
    static void convert(String s) {
        try {
            int n = Integer.parseInt(s);
            System.out.println("Integer value = " + n);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number. Please enter a valid integer.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.nextLine();
        convert(s);
        sc.close();
    }
}
