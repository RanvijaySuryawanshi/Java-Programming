package usefull;
public class useme{
    public void area(double length, double breadth){
        double result = length * breadth;
        System.out.println("Area of Rectangle : " + result);
    }
    public void salary(double basicSalary, double allowance){
        double result = basicSalary + allowance;
        System.out.println("Total Salary = " + result);
    }
    public void percentage(double obtainedMarks, double totalMarks){
        double result = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage = " + result + "%");
    }
}

