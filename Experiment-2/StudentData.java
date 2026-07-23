class Student{
    String name;
    int roll;
    String dept;
    Student(){
        name = "Ranvijay";
        roll = 21;
        dept = "CSE-1";
    }
    Student(String c, int s, String v){
        name = c;
        roll = s;
        dept = v;
    }
    Student(Student s){
        name = s.name;
        roll = s.roll;
        dept = s.dept;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + roll);
        System.out.println("Department: " + dept);
        System.out.println();
    }
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Parnil", 3, "CSE-2");
        Student s3 = new Student(s1);

        s1.display();
        s2.display();
        s3.display();
    }
}