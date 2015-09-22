
public class ThreadingInDepth {
	
public static void main(String[] args) {
	
	
	PrinterClass t1 = new PrinterClass();
	t1.setName("T1");
	t1.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	
	PrinterClass t2 = new PrinterClass();
	t2.setName("T2");
	t2.setPriority(Thread.NORM_PRIORITY);
	t2.start();
	
	PrinterClass t3 = new PrinterClass();
	t3.setName("T3");
	t3.start();
	
	PrinterClass t4 = new PrinterClass();
	t4.setName("T4");
	t4.setPriority(Thread.MAX_PRIORITY);
	t4.start();

	
}	
	

}

class PrinterClass extends Thread
{

	public void run()
	{
		System.out.println("Hello there.. I am "+ Thread.currentThread().getName() +" priority : "+ Thread.currentThread().getPriority());
		
	}
	
}
