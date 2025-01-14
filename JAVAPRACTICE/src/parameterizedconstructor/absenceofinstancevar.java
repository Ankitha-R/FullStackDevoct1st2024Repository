package parameterizedconstructor;


class customer{
	customer(String name,String location)
	{
		System.out.println("name:"+name);
		System.out.println("location:"+location);
	}
}

public class absenceofinstancevar {

	public static void main(String[] args) {
		customer cus=new customer("ankitha","banglore");

	}

}
