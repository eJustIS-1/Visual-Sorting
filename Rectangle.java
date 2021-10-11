package shape;

import java.awt.Color;
import java.awt.Graphics;


public class Rectangle implements Shape, Comparable <Shape> {
	
	private int upperX; 
	private int upperY;
	private int width;
	private int height;
	private Color shapeColor;
	
	
	public Rectangle (int upperX, int upperY, int width, int height, Color shapeColor) {
		this.upperX = upperX;
		this.upperY = upperY;
		this.width = width;
		this.height = height;
		this.shapeColor = shapeColor;
	}
	
	@Override
	public int getX(){
		return this.upperX;
	}
	
	@Override
	public int getY(){
		return this.upperY;
	}
	
    public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
    @Override
    public void setXandY(int x, int y){
		this.upperX = x;
		this.upperY = y;
	}
	
    @Override
	public Color getColor() {
		return shapeColor;
	}

	@Override
	public int area() {
		return width*height;
	}
	
	@Override
	public  void drawShape(Graphics	form) {
		form.fillRect(upperX, upperY, width, height);
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

	
}
