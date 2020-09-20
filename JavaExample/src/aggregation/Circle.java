package aggregation;

import java.util.Scanner;

public class Circle {
	
	public double area(double r)
	{
		Square s=new Square();
		double area=s.squArea(r);
		System.out.println("Square Area"+area);
		double ar=3.14f*r*r;
		return(ar);
		
	}
	public static void main(String args[])
	{
		Circle c=new Circle();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Radius");
		double r=s.nextDouble();
		double a=c.area(r);
		System.out.println("Circle Area"+a);
		
	}

}
