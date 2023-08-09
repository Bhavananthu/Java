package assign;

class Student
	{
	int rollno;
	String name;
	static String college2 = "ACT";
	static void change()
	{
	college2 = "BHC";
	}
	Student(int r, String n)
	{
	rollno = r;
	name = n;
	}
void display()
	{
	System.out.println("ROLL NO: "+rollno+" NAME: "+name+"  COLLEGE:"+college2);
	}
}
public class TestStaticMethod
{
	public static void main(String args[])
	{
	Student.change();
	Student s1 = new Student(111,"BOW");
	Student s2 = new Student(222,"MONISH");
	Student s3 = new Student(333,"VENKATESH");
	s1.display();
	s2.display();
	s3.display();
	}
}
