package gentechAcademy;


class calculate
{
	int fact(int num)
	{
		int fact=1;
		for(int i=num; i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	
	void getfact(int num)
	{
		int fact=1;
		for(int i=num; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}

public class factofno {

	public static void main(String[] args) {
		calculate c=new calculate();
		int v1=c.fact(6);
		System.out.println(v1);
	    c.getfact(5);
		

	}

}
