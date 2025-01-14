package parameterizedconstructor;
class insurance11{
	insurance11(int policyno,String holdername)
	{
		System.out.println(policyno);
		System.out.println(holdername);
	}
	insurance11(double premiumamount)
	{
		System.out.println(premiumamount);
	}
	insurance11(String coverageDetails)
	{
		System.out.println(coverageDetails);
	}
}

public class demo4 {

	public static void main(String[] args) {
		insurance11 ins=new insurance11(121,"ankitha");
		insurance11 ins1=new insurance11(250);
		insurance11 ins2=new insurance11("medical expences");
		

	}

}

