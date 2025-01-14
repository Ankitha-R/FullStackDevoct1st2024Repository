package withconstructor;

class purchase
{
	int productID;
	String productName;
    String  productCategory;
	String productPrice;
	String productDescription;
	
	purchase()
	{
		productID=1;
		productName="Asus";
		productCategory="electronics";
		productPrice="50000";
		productDescription="A high-performance laptop";
		System.out.println("productID:"+productID);
		System.out.println("productName:"+productName);
		System.out.println("productCategory:"+productCategory);
		System.out.println("productPrice:"+productPrice);
		System.out.println("productDescription:"+productDescription);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	}
	
}
class sales
{
	String customerName;
	int salesID;
	int  salesAmount;
	String salesDate;
	String paymentMethod;
	
	sales()
	{
		customerName="Vidya";
		salesID=1;
		salesAmount=80000;
		salesDate="9/12/2024";
		paymentMethod="UPI";
		System.out.println("customerName:"+customerName);
		System.out.println("salesID:"+salesID);
		System.out.println("salesAmount:"+salesAmount);
		System.out.println("salesDate:"+salesDate);
		System.out.println("paymentMethod:"+paymentMethod);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
	}
}

class inventory
{
	
	    int productID;      
	    String productName;  
	    int stockQuantity;    
	    int reorderLevel;     
	    double productPrice;   
	
	 inventory()
	 {
		 productID=1;
		 productName="Asus";
		 stockQuantity=100;
		 reorderLevel=75;
		 productPrice=50859;
		 System.out.println("productID:"+ productID);
		 System.out.println("productName:"+ productName);
		 System.out.println("stockQuantity:"+ stockQuantity);
		 System.out.println("reorderLevel:"+ reorderLevel);
		 System.out.println("productPrice:"+ productPrice);
		 
	 }
	
}
public class maindemo4 {

	public static void main(String[] args) 
	{
		purchase pur=new purchase();
		sales sal=new sales();
		inventory inv=new  inventory();
		
	

	}

}

