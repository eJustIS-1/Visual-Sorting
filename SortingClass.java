package shape;
import java.util.Collections;
import java.util.List;

public class SortingClass {
	public SortingClass() {
		
	}
	
	
	public List<Shape> sortingMethod(List<Shape> arrList){
		//Reference: https://www.geeksforgeeks.org/selection-sort/
		int n = arrList.size();
		int tmpX, tmpY;
		int minX, minY;
		
		for(int i = 0; i < n - 1; i++) {
			int minIndex = arrList.indexOf(arrList.get(i));
			
			for(int j = i+1; j < n; j++) {
				
				if(arrList.get(j).compareTo(arrList.get(minIndex)) == -1 ) {
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
				//values for changing
				tmpX = arrList.get(i).getX();
				tmpY = arrList.get(i).getY();
				minX = arrList.get(minIndex).getX();
				minY = arrList.get(minIndex).getY();
				
				//Changing Values
				arrList.get(i).setXandY(minX, minY);
				arrList.get(minIndex).setXandY(tmpX,tmpY);
				//Changing Positions
				Collections.swap(arrList, arrList.indexOf(arrList.get(i)), arrList.indexOf(arrList.get(minIndex)));
				
				
				
			}
			
		}
		return arrList;
		
	}
}
