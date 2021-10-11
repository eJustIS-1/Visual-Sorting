package shape;

import java.util.Random;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {
	
	private Random random;
	List<Shape> shapeList;
	private Random randomWidth;
	private Random randomCirc;
	private Random randomColor;
	private SortingClass sortShape;
	
	
	public ShapeFactory() {
		random = new Random();
		shapeList = new ArrayList <Shape>();
		randomWidth = new Random();
		randomCirc = new Random();
		randomColor = new Random();
		sortShape = new SortingClass();
		
	}
	
	public void createShapeList() {
		 int shapeNum;
		 int upperX = 23;
		 int upperY = 23;
		 int offSet = 55;
		 
		 
		 for (int i = 0; i < 6; i++) {
			shapeNum =  random.nextInt(3);
			if(shapeNum == 0) {
				Color myColor1 = new Color(randomColor.nextInt(200), randomColor.nextInt(200), randomColor.nextInt(200));
				shapeList.add(new Rectangle(upperX, upperY, randomWidth.nextInt(30) + 20, randomWidth.nextInt(30) + 20, myColor1));
			}else if(shapeNum == 1) {
				Color myColor2 = new Color(randomColor.nextInt(200), randomColor.nextInt(200), randomColor.nextInt(200));
				shapeList.add(new Square(upperX, upperY, randomWidth.nextInt(30) + 20, myColor2));
			}else{
				Color myColor3 = new Color(randomColor.nextInt(200), randomColor.nextInt(200), randomColor.nextInt(200));
				shapeList.add(new Circle(upperX, upperY, randomCirc.nextInt(15) +  15, myColor3));
			}
			
			upperX +=  offSet;
			upperY +=  offSet;
		 }
	
}
	
	public List<Shape> getShapeList() {
		return shapeList;
	}
	
	public void emptyListHelper() {
		this.shapeList.clear();
	}
	
	public void sortHelper() {
		List<Shape> tmpList = new ArrayList <Shape>(this.shapeList);
		emptyListHelper();
		for (Shape shape: sortShape.sortingMethod(tmpList)) {
			this.shapeList.add(shape);
		}

	}
	
}
