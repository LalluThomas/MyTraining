package listexample;

import java.util.ArrayList;

public class Test {
	public void sample() {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		System.out.println("Values of Array List");
		for(Integer i:a1)
		{
			System.out.println(i);
		}
		a1.remove(2);
		System.out.println("After Removing");
		for(Integer p:a1)
		{
			System.out.println(p);
		}
		ArrayList<Integer>a2=new ArrayList<Integer>();
		a2.addAll(a1);
		System.out.println("Values of ArrayList2");
		for(Integer l:a1)
		{
			System.out.println(l);
		}
		int s=a1.size();
		System.out.println("Size of Arralist1:"+s);
		System.out.println("Size of Arralist2:"+a2.size());
	}
	
	
	public static void main(String args[]) {
		Test t1=new Test();
		t1.sample();
		
	}
	
	

}
