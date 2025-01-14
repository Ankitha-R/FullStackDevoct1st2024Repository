package parameterizedconstructor;
class employee1{
	employee1(int empID,String empName)
	{
		System.out.println(empID);
		System.out.println(empName);
	}
	employee1(String address,String phno)
	{
		System.out.println(address);
		System.out.println(phno);
	}
	
}

public class demo3 {
	public static void main(String args[])
	{
		employee1 emp=new employee1(1,"ankitha");
		employee1 emp1=new employee1("kollegal","55486532365");
	}
	

}
