import java.time.*;

public class CurrentDateTime {
    public static void main(String[] args) {
        System.out.println("Current Date and Time Given Below-\n"
                + LocalDate.now() + " " + LocalTime.now());
    }
}