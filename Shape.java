package shape;

import java.awt.Color;
import java.awt.Graphics;

public interface Shape {

	
	int area();
	void drawShape(Graphics form);
	int compareTo(Shape o);
	Color getColor();
	int getX();
	int getY();
	void setXandY(int x, int y);
	 
}
