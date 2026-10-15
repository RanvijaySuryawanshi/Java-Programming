import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter Date (dd-MM-yyyy): ");
        String dateInput = input.nextLine();

        LocalDate date = LocalDate.parse(dateInput, formatter);

        System.out.print("Enter Days, Months and Years to add/subtract: ");
        int days = input.nextInt();
        int months = input.nextInt();
        int years = input.nextInt();

        LocalDate addition = date.plusDays(days).plusMonths(months).plusYears(years);
        LocalDate subtraction = date.minusDays(days).minusMonths(months).minusYears(years);

        System.out.println("Addition: " + addition.format(formatter));
        System.out.println("Subtraction: " + subtraction.format(formatter));

        input.close();
    }
}