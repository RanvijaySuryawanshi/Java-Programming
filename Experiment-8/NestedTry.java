import java.util.Scanner;
public class NestedTry {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Outer try block started.");
            try {
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                System.out.println("Result = " + (100 / n));
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero.");
            }
            int[] a = {10, 20, 30};
            System.out.print("Enter array index: ");
            int i = sc.nextInt();
            System.out.println("Element = " + a[i]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid array index.");
        }
        sc.close();
    }
}
