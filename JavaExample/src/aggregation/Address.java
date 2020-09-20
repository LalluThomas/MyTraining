package aggregation;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		Address add=new Address();
		add.studentInfo();
		

	}
	public void studentInfo()
	{
		Student st=new Student();
		st.get();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Address");
		String addr=s.nextLine();
		System.out.println("Name:"+st.name);
		System.out.println("RollNumber:"+st.roll);
		System.out.println("Address:"+addr);
		
	}

}
