import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new Exception("Age is less than 18!");
            }
            System.out.println("Eligible.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
