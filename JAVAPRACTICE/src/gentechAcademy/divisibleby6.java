package gentechAcademy;

class calculation6
{
	
	int getcount()
	{

		int count=0;
		for(int i=100;i<=200;i++)
		{
			if(i%6==0)
			{
				count++;
			}
		}
		return count;
	}
}

public class divisibleby6 {

	public static void main(String[] args) {
		calculation6 cal6=new calculation6();
		int res=cal6.getcount();
		System.out.println(res);

	}

}
