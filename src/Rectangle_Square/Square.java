package Rectangle_Square;

public class Square extends Rectangle {

	private double side;
	
	public Square() {
		
		super();
	}
	
	public Square(double side) {
		
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		
		super(side, side, color, filled);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setLength(double side) {
		
		setSide(side);
	}
	
	public void setWidth(double side) {
		
		setSide(side);
	}
	
	@Override
	public String toString() {
		
		return "A Square with side = " + side + " and " + " which is a subclass of " + super.toString();
	}
	
	@Override
	public double getPerimeter() {
		return 4*getSide();
	}
	
	@Override
	public double getArea() {
		return getSide()*getSide();
	}
}
