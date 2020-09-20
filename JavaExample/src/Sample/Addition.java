package Sample;

public class Addition extends Multiplication {

	public static void main(String args[])
	{
		Multiplication mu=new Multiplication();
		mu.mul();
		Addition add=new Addition();
		add.sum();
	}
	
	public void sum()
	{
		super.print();
		int c=a+b;
		System.out.println(c);
	}
}
