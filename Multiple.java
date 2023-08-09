package inheritance;


	interface InterfaceA 
	{
	    void methodA();
	}

	
	interface InterfaceB 
	{
	    void methodB();
	}

	
	class MyClass implements InterfaceA, InterfaceB {

	    public void methodA() 
	    {
	        System.out.println("Method A called");
	    }


	    public void methodB() 
	    {
	        System.out.println("Method B called");
	    }
	}
public class Multiple 
{

	    public static void main(String[] args) 
	    {
	        MyClass myClass = new MyClass();
	        myClass.methodA();
	        myClass.methodB();
	    }



	}

