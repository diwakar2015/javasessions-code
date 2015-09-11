package exceptions;

public class AccountBalanceNegativeException extends Exception{
	
	public AccountBalanceNegativeException(String exceptionMsg)
	{
		super(exceptionMsg);
	}

}
