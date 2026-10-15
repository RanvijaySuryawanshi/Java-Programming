import java.util.function.*;

public class EulerSupplier {
    public static void main(String[] args) {

        Supplier<Double> getEulerNumber = () -> 2.718281828;

        System.out.println("Euler's Number is " + getEulerNumber.get());
    }
}