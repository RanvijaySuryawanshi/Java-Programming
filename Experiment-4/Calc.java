import java.util.Scanner;
class Calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary arithmetic operation using + - * / or %: ");
        String x = sc.next();
        String o = sc.next();
        String y = sc.next();
        Integer w = Integer.valueOf(x);
        int a = w.intValue();
        w = Integer.valueOf(y);
        int b = w.intValue();
        int c = 0;
        switch(o){
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
            case "%":
                c = a % b;
                break;
        }
        String z = x + " " + o + " " + y + " = " + c;
        System.out.println(z);
    }
}