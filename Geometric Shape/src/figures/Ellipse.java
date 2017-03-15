package figures;

public class Ellipse extends Geometric_shape {
	//Attrs
	private double semi_axis_a = 0d;
	private double semi_axis_b = 0d;
	final double PI = 3.14;
	//Constructors
	public Ellipse(){
		super();
	}
	
	public Ellipse(double a, double b){
		this.semi_axis_a = a;
		this.semi_axis_b = b;
	}
	
	public Ellipse(String name, double a, double b){
		super(name);
		this.semi_axis_a = a;
		this.semi_axis_b = b;
	}
	
	//Sets & Gets
	public void setSemi_axis_a(double a){
		this.semi_axis_a = a;
	}
	
	public void setSemi_axis_b(double b){
		this.semi_axis_b = b;
	}
	
	public double getSemi_axis_a(){
		return this.semi_axis_a;
	}
	
	public double getSemi_axis_b(){
		return this.semi_axis_b;
	}
	
	//Override area method
	@Override
	public double area(){
		return PI * getSemi_axis_a() * getSemi_axis_b();
	}
	

}
