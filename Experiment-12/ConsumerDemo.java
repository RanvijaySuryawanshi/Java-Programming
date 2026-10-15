import java.util.function.*;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> varA = (msg) -> {
            System.out.println(msg);
        };

        varA.accept("Hello World!");
    }
}