package parameterizedconstructor;

class person{
	String fullname;
	int age;
	person(String fullname ,int age)
	{
		this.fullname = fullname;
		this.age= age;
		System.out.println(fullname);
		System.out.println(age);
	}
	void show()
	{
		System.out.println(fullname);
		System.out.println(age);
	}
	
}
public class person1 {
	public static void main(String[] args) {
		person per=new person("ankitha",22);
		per.show();
		
		
	}

}
