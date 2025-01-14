package gentechAcademy;

class calculate3
{
	
	
	void displaycount()
	{
		int count=0;
		for(int i=50; i<=100; i++)
		{
			int look=0;
			for(int j=2;j<i;j++)
			{
				if(i%2==0)
				{
					look=look+1;
					break;
				}
			}
			if(look==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	void displaysum()
	{   int sum=0;
		for(int i=50; i<=100; i++)
		{
			int look=0;
			for(int j=2;j<i;j++)
			{
				if(i%2==0)
				{
					look=look+1;
					break;
				}
			}
			if(look==0)
			{
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
	}


		

	
	
	
	
	void display()
	{
		for(int i=50; i<=100; i++)
		{
			int look=0;
			for(int j=2; j<i;j++)
			{
				if(i%2==0)
				{
					look=look+1;
					break;
				}
			}
			if(look==0)
			{
				System.out.println(i+"is primeno");
			}
		}
	
	}
}

public class sampledemo4 {

	public static void main(String[] args) 
	{
		calculate3 c3=new calculate3();
		c3.display();
		c3.displaysum();
		c3.displaycount();
	
	}

}
