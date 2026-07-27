public class Shape{
    int l = 0;
    int b = 0;
    double r = 0;
    double a = 0;
    public void Calc(){
        if(b==0 && r==0)
            System.out.println("Square has area " + a);
        else if(r==0)
            System.out.println("Rectangle has area " + a);
        else
            System.out.println("Circle has area " + a);
    }
    public Shape(double n){
        a = n * n * 3.14;
        Calc();
    }
    public Shape(int n){
        l = n;
        a = l * l;
        Calc();
    }
    public Shape(int x, int y){
        l = x;
        b = y;
        a = l * b;
        Calc();
    }
    public Shape(Shape s){
        l = s.l;
        b = s.b;
        r = s.r;
        a = s.a;
        Calc();
    }
    public static void main(String[] args){
        Shape s1 = new Shape(5.0);
        Shape s2 = new Shape(3);
        Shape s3 = new Shape(4, 6);
        Shape s4 = new Shape(s3);
    }
}