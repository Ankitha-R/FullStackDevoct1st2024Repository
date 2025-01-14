package gentechAcademy;


class calculation
{
	int addition(int x, int y)
	{
		return (x+y);
	}
	
	int sub(int a, int b)
	{
		return(a-b);
	}
	
	int multiplication(int x, int y)
	{
		return (x*y);
	}
}

public class sampledemo2 {

	public static void main(String[] args) 
	{
		calculation c=new calculation();
		int a1=c.addition(40,20);
		System.out.println(a1);
		
		int a2=c.sub(40,20);
		System.out.println(a2);
		
	/*	int a3=c.multiplication(c.addition(2, 2),c.sub(8, 5));
		System.out.println(a3);
		*/
		
		int a3=c.multiplication(a1, a2);                                               //return value send it as parameter to another method
		System.out.println(a3);
		
	}

}
