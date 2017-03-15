package figures;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(2, 3);
		Rectangle rectangle3 = new Rectangle("Rectangle", 5, 3);

		
		if (rectangle2.area() == 6 && rectangle3.area() == 15)
		{
			System.out.println("ook");
		}
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(3);
		Circle circle3 = new Circle(5);
		
		Square square1 = new Square();
		Square square2 = new Square(2);
		Square square3 = new Square("Square", 4);
		
		Ellipse ellipse1 = new Ellipse();
		Ellipse ellipse2 = new Ellipse(2, 5);
		Ellipse ellipse3 = new Ellipse("Ellipse", 3, 8);
		
		
		ArrayList<Geometric_shape> figures = new ArrayList<>();
		
		
		figures.add(rectangle1);
		figures.add(rectangle2);
		figures.add(rectangle3);
		
		figures.add(circle1);
		figures.add(circle2);
		figures.add(circle3);
		
		figures.add(square1);
		figures.add(square2);
		figures.add(square3);

		figures.add(ellipse1);
		figures.add(ellipse2);
		figures.add(ellipse3);
		
		for (Geometric_shape figure : figures){
			System.out.println("The area of " + figure.getName() + " is " + figure.area());
		}

		
	}

}
