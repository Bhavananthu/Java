package assign;

public class Consparameter {
	int id;
	String name;
	Consparameter(int i,String n)
	{
	id = i;
	name = n;
	}
	void display()
	{
	System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		Consparameter s1 = new Consparameter(111,"Karan");
		Consparameter s2 = new Consparameter(222,"Aryan");
	s1.display();
	s2.display();

}

}