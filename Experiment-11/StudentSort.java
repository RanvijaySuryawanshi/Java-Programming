import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSort {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Rohan "); 
        students.add("Pawan");
        students.add("Karan");

        System.out.println("Before Sorting:");
        System.out.println(students);

        Collections.sort(students, (a, b) -> a.compareTo(b));

        System.out.println("After Sorting:");
        System.out.println(students);
    }
}
