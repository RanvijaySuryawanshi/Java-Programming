/*write a program to implement multiple inheritance using interfaces by declare FY SY as base interfaces
containing data members rollNo, name, and result. Create a class Students that implemenys both interfaces
 to except and display the information.*/ 

import java.util.*;
interface FY {
    void FYA();
}
interface SY {
    void SYA();
}
class Student implements FY, SY {
    int rollNo;
    String name;
    double result;
    Scanner sc = new Scanner(System.in);
    public void FYA() {
        System.out.println("Enter FY Student Details:");
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No.: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Marks: ");
        result = sc.nextDouble();
    }
    public void SYA() {
        System.out.println("\nEnter SY Student Details:");
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll No.: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Marks: ");
        result = sc.nextDouble();
    }
    public void Out() {
        System.out.println("\nStudent Information");
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Result: " + result + "%");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.FYA();
        s1.Out();
        s2.SYA();
        s2.Out();
    }
}
