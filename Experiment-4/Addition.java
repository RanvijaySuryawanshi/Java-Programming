import java.util.Scanner;
public class Addition{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X: ");
		String x = sc.nextLine();
		System.out.print("Enter Y: ");
		String y = sc.nextLine();
		Integer w =  Integer.valueOf(x);
		int m = w.intValue();
		w = Integer.valueOf(y);
		int n = w.intValue();
		int s=m+n;
		System.out.print("Sum is " + s);
    }
}
