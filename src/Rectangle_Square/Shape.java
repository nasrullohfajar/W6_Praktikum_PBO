package Rectangle_Square;

public class Shape {
	
	private String color;
	private boolean filled;
	
	public Shape() {
		
		this.setColor("red");
		this.setFilled(true);
	}
	
	public Shape(String color, boolean filled) {
		
		this.setColor(color);
		this.setFilled(filled);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		
		return "A shape with color of " + color + "and " + (filled ? "Filled" : "Not Filled");
	}
}
