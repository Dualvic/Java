package figures;

public class Rectangle extends Geometric_shape {
	//Attributes
	private double side_a = 0d;
	private double side_b = 0d;
	
	//Constructors
	//Empty
	public Rectangle(){
		super();
		
	}
	
	//With sides
	public Rectangle(double a, double b){
		super();
		this.side_a = a;
		this.side_b = b;
	}
	
	//With sides & name
	public Rectangle(String name, double a, double b){
		super(name);
		this.side_a = a;
		this.side_b = b;
	}
	
	//Sets & Gets
	public void setSide_a(double a){
		this.side_a = a;
	}
	
	public void setSide_b(double b){
		this.side_b = b;
	}
	
	
	public double getSide_a(){
		return this.side_a;
	}
	
	public double getSide_b(){
		return this.side_b;
	}
	
	
	//Override area method from Geometric_shape
	@Override
	public double area(){
		return getSide_a() * getSide_b();
	}
	
	public void applyTheme() {
		
		System.out.println("A cool theme has been applied to: " + getName());
		
		//else {
			//System.out.println("A cool theme has been applied to: " + getName());
		//}
	}

}
