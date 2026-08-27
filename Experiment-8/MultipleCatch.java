import java.util.Scanner;
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        try {
            System.out.print("Enter array index: ");
            int index = sc.nextInt();
            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();
            System.out.println("Array element = " + arr[index]);
            System.out.println("Result = " + (100 / divisor));
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }
        sc.close();
    }
}