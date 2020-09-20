package exinterface;

public class Abc implements Test {
	public void hello()
	{
		System.out.println(" Hello");
	}
	public static void main()
	{
		Test ob=new Abc();
		ob.hello();
	}

}
