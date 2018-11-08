package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;

public class Rectangle implements Shape {
	
	private int a;
	private int b;
	
	public Rectangle(int a, int b){
		this.a=a;
		this.b=b;
	}
	public int calculateArea() {
		return a*b ;
	}
	
	

}
