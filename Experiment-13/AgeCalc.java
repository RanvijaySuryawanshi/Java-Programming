import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter DOB (dd-mm-yyyy): ");
        String date = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(date, formatter);

        Period age = Period.between(birthDate, LocalDate.now());

        System.out.println("Current Age: " + age.getYears() + " years "
                + age.getMonths() + " months "
                + age.getDays() + " days");

        input.close();
    }
}