package bank.test;

public class SBI extends ParentBankAbstract implements StateBankInterface{

	private double SI;
	
	
	public double calculateInterestRate()
	{
		SI = (getBalance()) *(1 + (getInterestRate() * getTime()));
		return SI;
	}
	
	public double updateBalance()
	{
		Balance = getBalance() + SI ; 
		return Balance;
	}

	public double addBonus()
	{
		Balance = getBalance() + 1000;
		return Balance;
	}
}
