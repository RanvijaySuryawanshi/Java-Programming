import java.util.function.*;

public class GreetingSupplier {
    public static void main(String[] args) {

        Supplier<String> getMessage = () -> {
            return "Hello Experiment XII";
        };

        System.out.println(getMessage.get());
    }
}