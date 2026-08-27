import java.util.Scanner;
public class NestedTry {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Outer try block started.");
            try {
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                System.out.println("Result = " + (100 / num));
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero.");
            }
            int[] arr = {10, 20, 30};
            System.out.print("Enter array index: ");
            int index = sc.nextInt();
            System.out.println("Element = " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid array index.");
        }
        sc.close();
    }
}