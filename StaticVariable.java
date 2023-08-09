package assign;
class Students
{
int rollno; String name;
static String college ="BHC";
Students(int r, String n)
{
rollno = r;
name = n;
}
void display ()
{
System.out.println("ROLL NO: "+rollno+" NAME: "+name+"  COLLEGE:"+college);
}
}

public class StaticVariable {
	public static void main(String args[])
	{
	Students s1 = new Students(111,"BOW");
	Students s2 = new Students(222,"MONISH");
	s1.display();
	s2.display();
	}
}