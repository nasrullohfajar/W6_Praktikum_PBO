package Rectangle_Square;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape shape1 = new Shape();
		Shape shape2 = new Shape("Red", true);
		
		System.out.println(shape1.toString());
		System.out.println(shape2.toString());
		
		Circle circle1 = new Circle();
		System.out.println(circle1.toString());
		
		Rectangle rect1 = new Rectangle();
		System.out.println(rect1.toString());
		
		Square square1 = new Square(5);
		System.out.println(square1.toString());
	}

}
