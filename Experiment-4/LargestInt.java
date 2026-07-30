import java.util.Scanner;
public class LargestInt{
    public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X: ");
		String x = sc.nextLine();
		System.out.print("Enter Y: ");
		String y = sc.nextLine();
		System.out.print("Enter Z: ");
		String z = sc.nextLine();
		Integer w =  Integer.valueOf(x);
		int a = w.intValue();
		w = Integer.valueOf(y);
		int b = w.intValue();
		w = Integer.valueOf(z);
		int c = w.intValue();
		String o;
		if(a>b)		{
			if(a>c)
				o = "A";
			else
				o = "C";
		}
		else{
			if(b>c)
				o = "B";
			else
				o = "C";
		}
		System.out.print(o + " is the greatest integer");
    }
}
