interface Message {
    void display();
}

public class NoParameterLambda {
    public static void main(String[] args) {

        Message msg = () -> {
            System.out.println("Hello, This is in Lambda Expression!");
        };

        msg.display();
    }
}