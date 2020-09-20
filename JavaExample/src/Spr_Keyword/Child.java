package Spr_Keyword;

public class Child  extends Parent{

	public static void main(String args[])
	{
		Child c=new Child();
		c.add();
	}
	
	public void add()
	{
		super.print();
		int c=a+b;
		System.out.println(c);
	}
	
	public Child()
	{
		super();
		System.out.println("Default constractor of child class");
	}
}
