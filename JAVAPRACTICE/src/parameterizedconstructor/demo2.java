package parameterizedconstructor;
class employee{
	employee(int empid,String empname,String email,String address)
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(email);
		System.out.println(address);
		
	}
}
class department{
	department(int depId,String deptName,int noofemp)
	{
		System.out.println(depId);
		System.out.println(deptName);
		System.out.println(noofemp);
	}
}

class insurance{
	insurance(int policyno,String policyholdername,double primiumamount)
	{
		System.out.println(policyno);
		System.out.println(policyholdername);
		System.out.println(primiumamount);
		
	}
}
public class demo2 {

	public static void main(String[] args) {
		employee emp=new employee(1,"ankita","ankugmail.com","kollegala");
		department dep=new department(20,"HR",20);
		insurance ins=new insurance(12,"ankitha",250);
		
		
	}

}
