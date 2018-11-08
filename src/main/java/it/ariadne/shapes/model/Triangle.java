package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;

public class Triangle implements Shape{

	private int a;
	private int b;
	
	public Triangle(int a, int b){
		this.a=a;
		this.b=b;
	}
	public int calculateArea() {
		return (a*b)/2 ;
	}
	
	
}
