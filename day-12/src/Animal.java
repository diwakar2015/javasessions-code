
public abstract class Animal {
	
	int noOflegs;
	
	
	abstract void makeSound();
	
	void hello()
	{
		System.out.println("Hello");
	}
	


}


class Dog extends Animal
{

	@Override
	void makeSound() {
		System.out.println("Bark");
		
	}
	
}

class Cow extends Animal
{

	@Override
	void makeSound() {
	System.out.println("Cow sound");
		
	}
	
	

}

class Monkey extends Animal
{

	@Override
	void makeSound() {
		System.out.println("Money sound");
		
	}
	
	
	
	
}


