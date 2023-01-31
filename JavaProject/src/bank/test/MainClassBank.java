package bank.test;

public class MainClassBank {

	public static void main(String[] args)
	{
	
	ICICI obj1 = new ICICI();
	Scanner s1 = new Scanner(System.in);
	obj1.setBalance(1000);
	
	obj1.setInterestRate(5.5);
	System.out.println("Enter the time you want to calculate the interest for");
	
	obj1.setTime(s1.nextDouble());
	//obj1.setTime(2);
	System.out.println("SI on ICICI balance:" + obj1.calculateInterestRate());
	//System.out.println("Updated balance with interest" + (obj1.getBal) + (obj1.calculateInterestRate()));
	
	s1.close();
	
	
	SBI obj2 = new SBI();
	obj2.setBalance(2000);
	obj2.setInterestRate(2.5);
	obj2.setTime(2);
	System.out.println("SI on SBI balance:" + obj2.calculateInterestRate());
	System.out.println("Updated balance is:" + obj2.updateBalance());
	System.out.println("Updated balance with Bonus is:" + obj2.addBonus());
	
	}
}
