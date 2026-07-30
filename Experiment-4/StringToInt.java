import java.util.Scanner;
public class StringToInt{
    public static void main(String[] args){
		System.out.print("Enter integer: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Integer a =  Integer.valueOf(s);
		int p = a.intValue();
		System.out.println(s + " " + a + " " + p);
	}
}