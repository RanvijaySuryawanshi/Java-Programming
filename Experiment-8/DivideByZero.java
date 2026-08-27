import java.util.Scanner;
public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        finally {
            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}
