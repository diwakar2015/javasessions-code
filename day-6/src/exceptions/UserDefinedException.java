package exceptions;

public class UserDefinedException {
	
	public static void main(String[] args) throws AccountBalanceNegativeException {
		
		
		int balace = 1000;
		
		int withDrwanAmount = 100;
		
		for(int i = 1; i<=11; i++)
		{
			balace = balace - withDrwanAmount;
			try
			{
			if(balace < 0)
			{
				throw new AccountBalanceNegativeException("Balance can not be negative. Please deposit some money!!");
			}
			
			System.out.println("Withdrawn amount is "+ withDrwanAmount + " Balance is "+ balace);
			}
			catch(AccountBalanceNegativeException e)
			{
				System.out.println("Exception caught : "+ e.getMessage());
			}
		}
		
		
	}

}
