package assignment;

public class Calcuate extends Pay {

	float hra,pf;
	public void hraCalcuation()
	{
		super.PayInfo();
		 hra=super.sal*.5f;
		 pf=super.sal*.2f;
		//System.out.println(hra);
		
		//System.out.println(pf);
	}

}
