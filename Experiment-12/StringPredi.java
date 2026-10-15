import java.util.function.*;

public class StringPredicate {
    public static void main(String[] args) {

        // Check if string has 5 characters
        Predicate<String> checkLength = (String text) -> (text.length() == 5);

        if (checkLength.test("Hello"))
            System.out.print("5 letters");
        else
            System.out.print("Not 5 letters");
    }
}