package assignment;

import java.util.Scanner;

public class Offseason {
	
	public void discount()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("OfSeason");
		 System.out.println("Enter the Purchase amount");
		int  b=s.nextInt();
		float dis=b*.15f;
		System.out.println("Discount:"+dis);
	}

}
