package assignment;

import java.util.Scanner;

public class User {
	private int pinno;
		public int get() {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the pin");
			pinno=s.nextInt();
			return(pinno);
		}
	

}
