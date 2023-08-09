package bank;
 
public class Bankdemo 
{

	public static void main(String[] args) 
	{
		SavingAccount sa=new SavingAccount("Bow", "TN", 111, 45000);
				System.out.println(sa);
				sa.deposit(12000);
				
				System.out.println();
				System.out.println(sa);
				sa.withdraw(5000);
				
				System.out.println();
				System.out.println(sa);
				sa.withdraw(70000);
				
				System.out.println();
				System.out.println(sa);
				sa.deposit(120000);
				
				System.out.println();
				System.out.println(sa);

	}

}
