interface Square {
    void calculate(int n);
}

public class SingleParameterLambda {
    public static void main(String[] args) {

        Square s = (n) -> {
            System.out.println("Square = " + (n * n));
        };

        s.calculate(5);
    }
}