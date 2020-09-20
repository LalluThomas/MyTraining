package assignment;

import java.util.Scanner;

public class Add {

	int a,b,c;
	public int addition()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		 a=s.nextInt();
		 System.out.println("Enter the second number");
		 b=s.nextInt();
		 c=a+b;
		 return(c);
	}
}
