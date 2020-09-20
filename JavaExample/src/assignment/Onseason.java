package assignment;

import java.util.Scanner;

public class Onseason extends Offseason{

	public static void main(String[] args) {

		Onseason o=new Onseason();
		o.discount();
	}
	
	public void discount()
	{
		super.discount();
		Scanner s=new Scanner(System.in);
		System.out.println("OfSeason");
		 System.out.println("Enter the Purchase amount");
		int  b=s.nextInt();
		float dis=b*.40f;
		System.out.println("Discount:"+dis);
	}

}
