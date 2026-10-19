import java.util.*;
class MarksException extends Exception {
    MarksException(String msg) {
        super(msg);
    }
}
class StudentMarks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        try {
            if (marks < 0 || marks > 100)
                throw new MarksException("Invalid marks");
            else
                System.out.println("Valid marks");
        } 
        catch (MarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
