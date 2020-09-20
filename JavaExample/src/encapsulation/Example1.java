package encapsulation;

public class Example1 {
	
	
	public static void main(String args[])
	{
		//Example1 e=new Example1();
		Example2 ex=new Example2();
		ex.set("Lallu");
		System.out.println(ex.get());
	}
}
