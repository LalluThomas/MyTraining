package assignment;

public class Hdfc implements Rbi {

	public void deposit(float amount,int year) {
		double rec=1+(interest/year);
		double last=rec*year;
		System.out.println("Your final amount:"+last);
		
	}
	
	
	public static void main(String[] args) {
	 Rbi b=new Hdfc();
	 b.deposit(1000.0f, 3);	
	 }

}
