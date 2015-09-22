/**
 * 
 */
package com.multithreading.sync;


/**
 *  @author Diwakar
 *
 * Date:  Aug 7, 2015 2015
 * File: ThreadIssueHandle.java
 */
public class MainApp {

	public static void main(String[] args) {

		// This account object and balance should be common for all  the account holder threads
		Account account = new Account();

		for(int i=1; i<=5; i++)
		{
			WithDrawer userThread = new WithDrawer();
			userThread.account = account;	
			userThread.start();  // submitted to TS
			userThread.setName("AccountHolder-"+i);
		}

	}
}



