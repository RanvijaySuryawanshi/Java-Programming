interface Addition {
    void add(int a, int b);
}

public class MultipleParameterLambda {
    public static void main(String[] args) {

        Addition obj = (a, b) -> {
            System.out.println("Addition = " + (a + b));
        };

        obj.add(10, 20);
    }
}