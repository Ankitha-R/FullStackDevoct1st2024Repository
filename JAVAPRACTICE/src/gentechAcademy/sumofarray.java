package gentechAcademy;

class calculation7
{
	
	long getcount(long a[])
	{
		long sum=0;
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
}

public class sumofarray {

	public static void main(String[] args) 
	{
		long a[]= {10,20,30,40};
		calculation7 cal7=new calculation7();
		long res=cal7.getcount(a);
		System.out.println(res);
		
	}

}
