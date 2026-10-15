interface Calculator {
    int operation(int a, int b);
}

public class LambdaCalculator {
    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;

        int a = 20;
        int b = 10;

        System.out.println("Addition = " + addition.operation(a, b));
        System.out.println("Subtraction = " + subtraction.operation(a, b));
        System.out.println("Multiplication = " + multiplication.operation(a, b));
        System.out.println("Division = " + division.operation(a, b));
    }
}