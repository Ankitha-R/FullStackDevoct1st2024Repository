package parameterizedconstructor;

class person2{
	person2(String name,int age)
	{
		System.out.println(name);
		System.out.println(age);	
	}
}
class birds{
	birds(int noofwings,String feathercolor)
	{
		System.out.println(noofwings);
		System.out.println(feathercolor);
	}
}
class domesticanimal{
	domesticanimal(int noofmilkprovide)
	{
		System.out.println(noofmilkprovide);
		
	}
}
class product{
	product(double price,String name)
	{
		System.out.println(name);
		System.out.println(price);
	}
}
public class demo1 {

	public static void main(String[] args) {
		person2 per=new person2("ankitha",22);
		birds bir=new birds(2,"grey");
		domesticanimal dom=new domesticanimal(1);
		product pro=new product( 50000,"Asus");
	}

}
