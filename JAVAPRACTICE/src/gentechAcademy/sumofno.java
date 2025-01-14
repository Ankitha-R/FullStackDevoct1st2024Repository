package gentechAcademy;
class calculate5
{
	int display()
	{
		int sum=0;
		for(int i=10;i<=20;i++)
		{
			
			sum=sum+i;
			
		}
		return sum;
		
	}
	
}

public class sumofno {

	public static void main(String[] args)
	{
		
		calculate5 cal=new calculate5();
		int res=cal.display();
		System.out.println(res);
		
	}

}
