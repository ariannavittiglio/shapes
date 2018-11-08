package it.ariadne.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

import it.ariadne.shapes.model.Circle;
import it.ariadne.shapes.model.Rectangle;
import it.ariadne.shapes.model.Square;
 
public class ShapeTest {

	@Test
	public void testCircleArea() {
		Circle circle= new Circle(2);
		Circle circle2= new Circle(3);
		int circleArea= circle.calculateArea();
		int circleArea2= circle2.calculateArea();
		
		assertEquals("L'area di un cerchio con raggio 2 è 12", 12, circleArea);
		assertEquals("L'area di un cerchio con raggio 3 è 27", 27, circleArea2);
	}
	
	@Test
	public void testSquareArea() {
		Square square= new Square(2);
		Square square2= new Square(3);
		int squareArea= square.calculateArea();
		int squareArea2= square2.calculateArea();
		
		assertEquals("L'area di un quadrato con raggio 2 è 4", 4, squareArea);
		assertEquals("L'area di un quadrato con raggio 3 è 9", 9, squareArea2);
	}
	
	@Test
	public void testTriangleArea() {
		Triangle triangle= new Triangle(2,2);
		Triangle triangle2= new Triangle(2,3);
		int triangleArea= triangle.calculateArea();
		int triangleArea2= triangle2.calculateArea();
		
		assertEquals("L'area di un quadrato con lato lungo 2 e latoc corto 1 è 2", 1 , triangleArea);
		assertEquals("L'area di un quadrato con lato lungo 3 e latoc corto 2 è 6", 3 , triangleArea2);
	}
	
	
	@Test
	public void testRectangleArea() {
		Rectangle rectangle= new Rectangle(1,2);
		Rectangle rectangle2= new Rectangle(2,3);
		int rectangleArea= rectangle.calculateArea();
		int rectangleArea2= rectangle2.calculateArea();
		
		assertEquals("L'area di un quadrato con lato lungo 2 e latoc corto 1 è 2", 2 , rectangleArea);
		assertEquals("L'area di un quadrato con lato lungo 3 e latoc corto 2 è 6", 6 , rectangleArea2);
	}
	
	@Test
	public void testAddCanvas() {
		Canvas canvas= new Canvas();
		
		Circle circle= new Circle(2);
		Rectangle rectangle= new Rectangle(1,2);
		Square square= new Square(3);
		Triangle triangle= new Triangle(2,2);

		
		canvas.add(circle);
		canvas.add(rectangle);
		canvas.add(square);
		canvas.add(triangle);
		int canvasSize= canvas.size();
		
		assertEquals("il canvas di cui ho aggiunto 3 forme è di dimensione 3", 4 , canvasSize);

	}
	
	@Test
	public void testTotalArea() {
		Canvas canvas= new Canvas();
		
		Circle circle= new Circle(2);
		Rectangle rectangle= new Rectangle(1,2);
		Square square= new Square(2);
		Triangle triangle= new Triangle(2,2);

		canvas.add(circle);
		canvas.add(rectangle);
		canvas.add(square);
		canvas.add(triangle);
		int totalArea= canvas.TotalArea();
		
		assertEquals("area totale è 18", 18 , totalArea);
		
	}
	
	
	
	

}
