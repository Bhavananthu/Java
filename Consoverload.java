package assign;

public class Consoverload {
	int id;
	String name;
	int age;
	Consoverload(int i,String n)
	{
	id = i;
	name = n;
	}
	Consoverload(int i,String n,int a)
	{
	id = i;
	name = n;
	age=a;
	}
	void display()
	{
	System.out.println(id+" "+name+" "+age);
	}
	public static void main(String args[])
	{
	Consoverload s1 = new Consoverload(111,"Karan");
	Consoverload s2 = new Consoverload(222,"Aryan",25);
	s1.display();
	s2.display();
	}
}
