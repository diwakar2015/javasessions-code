
public interface Shape {
	
	public abstract  void primeter();
	public abstract  void area();
	
	public static final int x  =10;
	
}


class Circle implements Shape
{

	@Override
	public void primeter() {
		
		int r = 7;
		int p = 2* 22/7 *r;
		System.out.println("Perimeter of circle = "+ p);
	}

	@Override
	public void area() {
		int r = 7;
		int a =  22/7 *r *r;	
	System.out.println("Area of cricle is "+ a);	
	}
	
	
}

class Rectagle implements Shape
{

	@Override
	public void primeter() {
		int l = 10;
		int b = 20;
		int p = 2* (l+b);
	
		System.out.println("perimeter of rectangle is "+p);
		
	}

	@Override
	public void area() {
		int l = 10;
		int b = 20;
		System.out.println("Area = "+ (l*b));
	}
	
}