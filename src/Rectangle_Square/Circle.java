package Rectangle_Square;

public class Circle extends Shape{

	private double radius;
	
	public Circle() {
		
		super();
		this.radius = 1.0;
	}
	
	public Circle(double r) {
		
		super();
		this.radius = r;
	}
	
	public Circle(double r, String color, boolean filled) {
		
		super(color, filled);
		this.radius = r;
	}
	
	public double getRadius() {
		
		return radius;
	}
	
	public void setRadius(double radius) {
		
		this.radius = radius;
	}
	
	public double getArea() {
		
		return radius * radius * Math.PI;
	}
	
	public double getPremiere() {
		
		return Math.PI * (radius * 2);
	}
	
	@Override
	public String toString() {
		
		return "A Circle with radius = " + radius + " witch is " + "subclass of class";
	}
}
