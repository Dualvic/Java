package figures;

public abstract class Geometric_shape implements Drawable {
	
	private String name;
	
	//Empty constructor, 
	public Geometric_shape(){
		this.name = "Unknown";
	}
	
	//Constructor who gets only one argument
	public Geometric_shape(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public abstract double area();

	public void draw() {
		System.out.println("The " + getName() + " has been drawn.");
	}
	
}
