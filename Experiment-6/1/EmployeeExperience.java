import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class EmployeeExperience{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Joining Date (dd-MM-yyyy): ");
        String date = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate joiningDate = LocalDate.parse(date, formatter);
        LocalDate today = LocalDate.now();
        Period experience = Period.between(joiningDate, today);
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Joining Date: " + joiningDate.format(formatter));
        System.out.println("Work Experience: " + experience.getYears() + " Years " + experience.getMonths() + " Months " + experience.getDays() + " Days");
        sc.close();
    }
}