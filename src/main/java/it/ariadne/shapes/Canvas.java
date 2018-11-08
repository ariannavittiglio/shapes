package it.ariadne.shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	
	private List <Shape> shapes=new ArrayList<>();
	
	public int size() {
		return shapes.size();
	}
	
	public int TotalArea() {
		int totalArea=0;
		for(Shape shape: shapes){
			totalArea=totalArea+shape.calculateArea();
		}
		return totalArea;
	}

	public void add(Shape shape) {
		shapes.add(shape);
		
	}

		

}
