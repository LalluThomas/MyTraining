package aggregation;

import java.util.Scanner;

public class Student {
	
	String name,roll;
	public void get()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		name=s.nextLine();
		
		System.out.println("Enter the roll number");
		 roll=s.nextLine();
		
	}

}
