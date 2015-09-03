
 public class Car {
	
  private  String projectCodeName;
  
  public String model;
  
  public void blowHorn()
  {
	  System.out.println("Blowing horn");
	  
  }
  
  public void playMusic()
  {
	  System.out.println("Playing music");
  }
  
  public void displayModel()
  {
	  System.out.println("Model is "+ model);
  }
  
  private void displayProjectCodeName()
  {
	  System.out.println("Code Name "+ projectCodeName);
  }
  
  public static void main(String[] args) {
	
	  Car c = new Car();
	  
	  c.projectCodeName = "XYb";
	  
	  
	  c.displayProjectCodeName();
	  
}

}


