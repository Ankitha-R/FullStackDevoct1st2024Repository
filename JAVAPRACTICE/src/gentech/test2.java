package gentech;

class sample
{
	String getName(String name)
	{
		return name;
	}
}

public class test2 {

	public static void main(String[] args)
	{
		sample s1=new sample();
		String res = s1.getName("kollegal");
		System.out.println(res);
		
		

	}

}
