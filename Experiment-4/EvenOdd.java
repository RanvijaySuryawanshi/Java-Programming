import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
		System.out.print("Enter integer: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Integer a =  Integer.valueOf(s);
		int p = a.intValue();
		System.out.println(s + " " + a + " " + p);
		if (p%2 == 0)
			System.out.print("Even");
		else
			System.out.print("Odd");
    }
}