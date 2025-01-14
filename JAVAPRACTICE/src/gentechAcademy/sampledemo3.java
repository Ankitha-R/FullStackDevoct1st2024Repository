package gentechAcademy;


class calculation2
{
	int addition(int x, int y)
	{
		return (x+y);
	}
	
	int sub(int a, int b)
	{
		return(a-b);
	}
	
	int multiplication()
	{
		int x=addition(10,20);
		int y=sub(4,2);
		int z=(x*y);
		return z;
	 
	}
}

public class sampledemo3 {

	public static void main(String[] args) 
	{
		calculation2 c2=new calculation2();
		int res=c2.multiplication();
		System.out.println(res);
		
		int res1=c2.addition(90, 12);
		System.out.println(res1);
	}

}
