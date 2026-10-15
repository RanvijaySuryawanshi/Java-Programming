import java.util.function.*;

public class OddPredicate {
    public static void main(String[] args) {

        Predicate<Integer> checkOdd = (Integer number) -> (number % 2 != 0);

        if (checkOdd.test(7))
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}