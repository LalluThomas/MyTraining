package assignment;

public class Division extends Add{
	public static void main(String args[])
	{
		Division d=new Division();
		System.out.println("ADDITION OF TWO NUMBERS");
		d.divide();
		
	}
	
	public void divide()
	{
		int d=super.addition();
		System.out.println(d);
		int d1=d/10;
		System.out.println(d1);
		if(d1%10==0) {
			System.out.println("not Divisble by zero");
		}
		else
		{
			System.out.println(" Divisble by zero");
		}
	}

}
