
public class ArrayExample {
	public static void main(String[] args) {
		
		
		int arr[] = new int[20];
		
		int rollCounter = 200;
		
		for(int i=0; i<20; i++)
		{
			
			arr[i] = rollCounter;
			rollCounter = rollCounter + 1;
			
		}
		
		
		System.out.println("Displaying the roll numbers");
		
		for(int i = 0; i< 20; i++)
		{
			System.out.println("ROll : "+ arr[i]);
		}
		
	}

}
