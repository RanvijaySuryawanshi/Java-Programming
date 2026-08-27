import java.util.Scanner;
public class ArrayException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50};
        try {
            System.out.print("Enter array index: ");
            int i = sc.nextInt();
            System.out.println("Element = " + a[i]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        finally {
            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}
