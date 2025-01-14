package gentechAcademy;

class sample
{
	 void name(String name)
	{
		System.out.println(name);
	}
	
	 String getname(String name) 
	 {
		 return name;
		 
	 }
}

public class sampledemo1 {

	public static void main(String[] args) {
		 sample s=new  sample();
		 s.name("ankitha");
		 String r1=s.getname("ram");
		 System.out.println(r1);

	}

}
