
 public class Vehicle {

	
	//Member variables
	 String company;
	 byte noOfWheels;
	 String color;
	       double price;
	
	 void blowHorn()
	{
		System.out.println("Blowing horn");
	}
	
	
	public void playMusic()
	{
		System.out.println("Plaing music");
	}
	
	
	//Member methods
	public void displaycarInfo()
	{
		System.out.println("Company : "+ this.company + " NoOF Wheels : "+ this.noOfWheels + " color "+ this.color + " price : "+this.price);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Vehicle mercedes = new Vehicle();
		
		mercedes.company  = "Mercedes Model - 2015";
		mercedes.color = "Black";
		mercedes.noOfWheels = 4;
		mercedes.price = 5000;
		
		
	    Vehicle audi = new Vehicle();
		
	    audi.company  = "Audi RX - 2015";
	    audi.color = "White";
	    audi.noOfWheels = 4;
	    audi.price = 10000;
		
		
		
		mercedes.displaycarInfo();
		
		audi.displaycarInfo();
		
		
		
		
		
	}
	
	
}

