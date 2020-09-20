package exinterface;

public class EgAbc implements EgTest {
	public void hello()
	{
		System.out.println(" Hello");
	}
	public static void main()
	{
		EgTest ob=new EgAbc();
		ob.hello();
	}

}
