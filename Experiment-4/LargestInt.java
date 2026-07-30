import java.util.Scanner;
public class LargestInt{
    public static void main(String[] args) 	{
		System.out.print("Enter 3 integers X Y Z: ");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String y = sc.nextLine();
		String z = sc.nextLine();
		Integer w =  Integer.valueOf(x);
		int a = w.intValue();
		w = Integer.valueOf(y);
		int b = w.intValue();
		w = Integer.valueOf(z);
		int c = w.intValue();
		String res;
		if (a > b)		{
			if (a > c)
				res = "A";
			else
				res = "C";
		}
		else{
			if (b > c)
				res = "B";
			else
				res = "C";
		}
		System.out.print(res + " is the greatest integer");
    }
}