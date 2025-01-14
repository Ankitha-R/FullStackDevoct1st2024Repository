package withconstructor;

class employee
{
	int empid;
	String empname;
    String  phoneno;
	String email;
	String address;
	
	employee()
	{
		empid=1;
		empname="Ankitha";
		phoneno="9875967845";
		email="ankitha@gmail.com";
		address="kollegal";
		System.out.println("empid:"+empid);
		System.out.println("empname:"+empname);
		System.out.println("phoneno:"+phoneno);
		System.out.println("email:"+email);
		System.out.println("address:"+address);
		
	}
	
}
class department
{
	String departmentname;
	int departmentID;
	int noofemployees;
	String headofthedepartment;
	String location;
	
	department()
	{
		departmentname="HR";
		departmentID=1;
		noofemployees=80;
		headofthedepartment="delhi";
		location="bangalore";
		System.out.println("departmentname:"+departmentname);
		System.out.println("departmentID:"+departmentID);
		System.out.println("noofemployees:"+noofemployees);
		System.out.println("headofthedepartment:"+headofthedepartment);
		System.out.println("location:"+location);
		
		
		
	}
}

class insurance
{
	
	    String policyNumber;      
	    String policyHolderName;  
	    String insuranceType;    
	    double premiumAmount;     
	    String coverageDetails;   
	
	 insurance()
	 {
		 policyNumber="123";
		 policyHolderName="sushma";
		 insuranceType="health";
		 premiumAmount=250;
		 coverageDetails="medical expenses";
		 System.out.println("policyNumber:"+ policyNumber);
		 System.out.println("policyHolderName:"+ policyHolderName);
		 System.out.println("insuranceType:"+ insuranceType);
		 System.out.println("premiumAmount:"+ premiumAmount);
		 System.out.println("coverageDetails:"+ coverageDetails);
		 
	 }
	
}








public class maindemo2 {

	public static void main(String[] args) 
	{
		employee anku=new employee();
		department dep=new department();
		insurance ins=new  insurance();
		
	

	}

}
