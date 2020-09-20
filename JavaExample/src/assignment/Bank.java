package assignment;

public class Bank {

	private int pinno;
	public static void main(String[] args) {

		User b=new User();
		Bank b1=new Bank();
		int c=b.get();
		b1.validate(c);
		
		
	}


	private void validate(int c) {
		this.pinno=c;
		if(c== 1001 ||c==1234 || c==1212)
		{
			System.out.println("Valid pin");
		}
		else
		{
			System.out.println(" not  	Valid pin");
		}
		
	}


	public void set(int pinno) {
		this.pinno=pinno;
	}
}
