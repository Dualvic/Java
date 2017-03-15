package figuresTest;

import figures.*;
import java.util.*;
import figures.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class drawablesTest {

	private static ArrayList<Drawable> figures;

	@BeforeClass
	public static void meterCosas() {
		figures = new ArrayList<Drawable>();

		Rectangle rectangle2 = new Rectangle("rectantastico", 2, 3);

		Circle circle2 = new Circle("circuclito", 3);

		Square square2 = new Square("cuadradongo", 2);

		Ellipse ellipse2 = new Ellipse("elipstoide", 2, 5);

		figures.add(rectangle2);

		figures.add(circle2);

		figures.add(ellipse2);
		
		figures.add(square2);



	}

	@Test
	public void lengthDrawableTest() {
		assertEquals(4, figures.size(), 0);
	}

	@Test
	public void DrawTest() {
		
		PoolFiguras.drawList(figures);
		
	}
	
	@Test
	public void themetest() {
		
		PoolFiguras.applyThemeList(figures);
	}
}
