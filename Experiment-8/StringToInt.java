import java.util.Scanner;
public class StringToInt {
    static void convert(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println("Integer value = " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number. Please enter a valid integer.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str = sc.nextLine();
        convert(str);
        sc.close();
    }
}