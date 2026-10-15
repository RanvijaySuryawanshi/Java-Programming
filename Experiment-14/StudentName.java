import java.util.*;

public class StudentName {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Alex");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}