package assign;
	class Bikes
	{
	final void run()
	{
	System.out.println("running");
	}
	}
class FinalMethod extends Bikes
	{
	void run()
	{
	System.out.println("running safely with 100kmph");
	}
public static void main(String args[])
	{
	FinalMethod honda= new FinalMethod();
	honda.run();
	}
	}
