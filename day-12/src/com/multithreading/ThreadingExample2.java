package com.multithreading;


public class ThreadingExample2 {
	
	public static void main(String[] args) {
		
		
		
		NumberPrinterThread t1 = new NumberPrinterThread();
		
		Thread th1 = new Thread(t1);
		
		th1.setName("First-Thread");
		
		
NumberPrinterThread t2 = new NumberPrinterThread();
		
		Thread th2 = new Thread(t2);
		
		th2.setName("Second-Thread");
		
NumberPrinterThread t3 = new NumberPrinterThread();
		
		Thread th3 = new Thread(t3);
		
		th3.setName("Third-Thread");
		
		
		th1.start();
		th2.start();
		th3.start();
		
		
	}
	

}


class NumberPrinterThread implements Runnable
{

	@Override
	public void run() {
		
		
		for(int i =1; i<=10; i++)
		{
			System.out.println("Value is "+ i + " Printed by thread "+ Thread.currentThread().getName());
		}
		
	}
	
}