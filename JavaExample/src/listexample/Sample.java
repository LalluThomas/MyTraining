package listexample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Sample {
	public static void main(String args[])
	{
		Sample s=new Sample();
		s.link();
	}

	public void link() {
		List<String>a1=new LinkedList<>();
		a1.add("Welcome");
		a1.add("to");
		a1.add("our");
		a1.add("website");
		Iterator<String>itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		
			System.out.println(a1);
		}
		
}
