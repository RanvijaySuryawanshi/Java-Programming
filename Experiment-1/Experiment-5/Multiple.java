interface FY{
    int roll = 21;
    String name = "Ranvijay Suryawanshi";
}
interface SY{
    double score = 97.5;
}
class Student implements FY, SY{
    void display(){
        System.out.println("Roll No = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Result = " + score);
    }
    public static void main(String[] args){
        Student s = new Student();
        s.display();
    }
}