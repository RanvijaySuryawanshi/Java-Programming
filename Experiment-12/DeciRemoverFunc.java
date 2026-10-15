import java.util.function.*;

public class DecimalRemoverFunction {
    public static void main(String[] args) {

        Function<Double, Integer> removeDecimal = (Double value) -> {
            return value.intValue();
        };

        System.out.print(
            "Value with decimal part removed is " + removeDecimal.apply(6.767)
        );
    }
}