package withconstructor;
class person1
{
	String fullname;
	int age;
	person1()
	{
		fullname="sachin";
		age=37;
		System.out.println("fullname: "+ fullname);
		System.out.println("age:"+ age);
		
	    
	}
}

class birds
{
	
	 int noofwings;
	 String feathercolor;
	 birds()
	 {
		 noofwings=2;
		 feathercolor="grey";
		 System.out.println("noofwings:"+noofwings);
		 System.out.println("feathercolor:"+feathercolor);
		 
	 }
	
}

class domesticanimal
{
	int quantityofmilkprovide;
	String breed;
	domesticanimal()
	{
		quantityofmilkprovide=3;
		breed="jersy";
		System.out.println("quantityofmilkprovide:"+quantityofmilkprovide);
		System.out.println("breed:"+breed);
		
	}
	
	
}
class product
{
	String productname;
	double price;
	product()
	{
		productname="asus notebook";
		price=50000;
		System.out.println("productname:"+productname);
		System.out.println("price:"+price);
		
	}
	
}


public class maindemo1 {

	public static void main(String[] args)
	{
		person1 sachin=new person1();
		birds sparrow=new birds();
		domesticanimal cow=new domesticanimal();
		product asus=new product();
		

	}

}
