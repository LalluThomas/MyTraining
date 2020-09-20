package Hierarchical;



public class Example2 extends Example{
	

	public static void main(String args[])
	{
		Example1 mu=new Example1();
		mu.mul();
		Example2 add=new Example2();
		add.sum();
	}
	
	public void sum()
	{
		int c=a+b;
		System.out.println(c);
	}

}
