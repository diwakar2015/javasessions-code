
public class JoinExample {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		A t1 = new A("Cache-Service");
		A t2 = new A("DB-Service");
		A t3 = new A("WebService-Service");
		A t4 = new A("Server-1Service");
		A t5 = new A("Serv-2-Service");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		t1.join();
		t2.join();
		
		
		
	
		
		System.out.println("All services are up and running...showing GUI now..."+ Thread.currentThread().getName());
		
		
	}

}


class A extends Thread
{
	String serviceType;
	A(String serviceType)
	{
		this.serviceType = serviceType;
	}
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Brining up the service "+ this.serviceType + Thread.currentThread().getName());
		
		
	}
	
}
