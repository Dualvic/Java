package figures;

public class Square extends Geometric_shape {
	// Attrs.
	private double side = 0d;

	// Constructors
	public Square() {
		super();
	}

	public Square(double side) {
		this.side = side;
	}

	public Square(String name, double side) {
		super(name);
		this.side = side;
	}

	// Set & Get
	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return this.side;
	}

	// Override area method
	public double area() {
		return Math.pow(getSide(), 2);
	}

	public void applyTheme() {

		System.out.println("A cool theme has been applied to: " + getName());

	}
}
