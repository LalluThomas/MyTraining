package assignment;

import java.util.Scanner;

public class Pay {
	int sal,dect,bonus; 
	public void PayInfo()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		sal=s.nextInt();
		System.out.println("Enter the deduction");
		dect=s.nextInt();
		System.out.println("Enter the bonus");
		bonus=s.nextInt();
		
	}

}
