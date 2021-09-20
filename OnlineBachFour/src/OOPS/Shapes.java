package OOPS;

public class Shapes {

//Method Overloading	
	public void calArea(int redius ) {
		System.out.println(3.14*(redius*redius));
	}
	
	public double calArea( double length, int width ) {
		System.out.println(length*width);
		return length*width;
	}
	
	public void calArea(  int height, double base) {
		System.out.println(height*base);
	}
}
