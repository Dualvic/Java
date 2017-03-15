package figures;

public interface Drawable {
	

	Exception ElipseException = null;
	
	public void draw();
	
	public default void applyTheme() {
		throw new UnsupportedOperationException("Theme cannot be applied") ;
		
	}
	
	
}
