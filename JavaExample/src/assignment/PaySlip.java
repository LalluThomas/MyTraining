package assignment;

public class PaySlip extends Calcuate {
	public static void main(String args[])
	{
		PaySlip pay=new PaySlip();
		pay.SalarySlip();
		
		
	}
	
	public void SalarySlip()
	{
		super.hraCalcuation();
		double salary=sal+hra-dect+bonus;
		System.out.println("Basic Salary:"+sal);
		System.out.println("Decution 	:"+dect);
		System.out.println("HRA amount  :"+hra);
		System.out.println("PF amount    :"+pf);
		System.out.println("Bouns ampunt  :"+bonus);
		System.out.println("Your Total Salary :"+salary);
	}

}
