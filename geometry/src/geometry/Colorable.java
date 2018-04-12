package geometry;

import java.awt.Color;

public interface Colorable {
	Color defaultColor = Color.RED;
	
	Color getColor();
	
	void setCOlor(Color color);
	
}
