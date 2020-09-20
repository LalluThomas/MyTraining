package Sample;

import java.util.Scanner;

public class Licence {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Age");
		int e=s.nextInt();
		if(e>18)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println(" Not Eligible");
		}
	}
}
