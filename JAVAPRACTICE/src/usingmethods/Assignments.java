package usingmethods;

class Assign
{
    void as()
    {
        String s[]= {"Mayu","Somu","Anku","Mani"};
        String b=" ";
        for(int i=s.length/2;i<s.length;i++)
        {
            b+=s[i];
        }
        System.out.println(b);
    }
}
public class Assignments
{
    public static void main(String args[])
    {
        Assign a=new Assign();
        a.as();
}
}
