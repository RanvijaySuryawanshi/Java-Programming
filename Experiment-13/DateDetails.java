import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Date (dd-mm-yyyy): ");
        String dateInput = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateInput, formatter);

        System.out.println("Year: " + date.getYear()
                + "\nMonth: " + date.getMonth()
                + "\nDate: " + date.getDayOfMonth()
                + "\nDay: " + date.getDayOfWeek());

        input.close();
    }
}
