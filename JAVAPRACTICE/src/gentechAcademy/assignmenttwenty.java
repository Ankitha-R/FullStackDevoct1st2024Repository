package gentechAcademy;


class Native
{
	int getCube(int x)
    {
		 return x*x*x;
    }
}
public class  assignmenttwenty {
    public static void main(String[] args) {
        Native n=new Native();
        int x=10;
        int m=n.getCube(x);
        System.out.println(m);
    }
}
