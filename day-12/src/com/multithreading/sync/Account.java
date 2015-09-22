package com.multithreading.sync;


class Account 
{

	



	int balance = 5000;

	public synchronized void withdraw(int amount) throws AccountBalanceNegativeException, InterruptedException
	{
		
		System.out.println("Hello Java");

		
			int diff = balance - amount;

			if(diff>=0)
			{			
				//t1 was removed after doing the check

				balance = balance- amount;  // 4800 fro ac4
				// 1st thread reached here and was removed by TS at this point of time


				System.out.println("Withdrew amount : "+amount +  " and now balance is : "+  balance + " by "+ Thread.currentThread().getName());
				if(balance<0)
				{
					throw new AccountBalanceNegativeException("Balance can not be negative. Current balance is :"+ balance);
				}
			}
		

		}

	}

	class WithDrawer extends Thread
	{
		Account account;

		public void run()
		{

			try {
				//System.out.println("Going to withdraw money from account  "+ " by "+ Thread.currentThread().getName() + " balance is "+ account.balance);
				account.withdraw(100);

			} catch (Exception e) {

				System.out.println("Exception :"+ e);
			}

		}

	}
