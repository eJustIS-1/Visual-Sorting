package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shape, Comparable <Shape>{
	
	private int upperX; 
	private int upperY;
	private int width;
	private Color shapeColor;
	
	public Circle (int upperX, int upperY, int width, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.shapeColor = shapeColor;
	}
	
	public int getWidth() {
	    return width;
	}
	
	public void setWidth( int width) {
		this.width = width;
	}
	
	@Override
	public int getX(){
		return this.upperX;
	}

	@Override
	public int getY(){
		return this.upperY;
	}
	
	@Override
	public int area() {
		int radius = width / 2;
		
		return (int) (Math.PI * radius * radius);
	}
	
	@Override
	public  void drawShape(Graphics	form) {
		form.fillOval(upperX, upperY, width, width);
	}


	@Override
	public Color getColor() {
		return shapeColor;
	}

	@Override
	public int compareTo(Shape o) {
		if(this.area() > o.area()){
			return 1;
		}
		else if(this.area() < o.area()){
			return -1;
		}
		return 0;
	}
	
	@Override
	public void setXandY(int x, int y){
		this.upperX = x;
		this.upperY = y;
	}

}
