/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 
 * 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth,
 *  that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 
 *  'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.*/
 
package com.Assignment;

public class Q32_shapeArea {
	public static abstract class Shape{
		public abstract void RectangleArea(float l, float b);
		public abstract void SquareArea(double l);
		public abstract void CircleArea(float r);
	}
	
	public static class Area extends Shape{

		public void RectangleArea(float l, float b) {
			float area=l*b;
			System.out.println("Rectangle area is: "+area);
		}

		public void SquareArea(double l) {
			double area=l*l;
			System.out.println("Square area is: "+area);
		}

		public void CircleArea(float r) {
			double area=2*3.14*r;
			System.out.println("Circle area is: "+area);
		}
		
	}
	
	public static void main(String[] args) {
		Area a=new Area();
		a.RectangleArea(3, 7);
		a.SquareArea(5.6);
		a.CircleArea(4);
	}
}
