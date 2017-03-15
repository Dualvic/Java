package figures;

import java.util.*;

public class PoolFiguras {

	public static void drawList(ArrayList<Drawable> containerDeFiguras) {
		for (Drawable figura : containerDeFiguras) {
			figura.draw();
		}
	}

	public static void applyThemeList(ArrayList<Drawable> containerDeFiguras) {

		for (Drawable figura : containerDeFiguras) {
			try {

				figura.applyTheme();
			} catch (UnsupportedOperationException exception) {
				System.out.println(exception);
			}

		}
	}
}
