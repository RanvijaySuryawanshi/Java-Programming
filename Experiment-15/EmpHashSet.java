import java.util.*;

public class EmployeeHashSet {
    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();
        employees.add("Alex");
        employees.add("Bob");
        employees.add("Charlie");
        employees.add("David");
        employees.add("Eve");

        System.out.println("Employee Names:");

        for (String name : employees) {
            System.out.println(name);
        }
    }
}