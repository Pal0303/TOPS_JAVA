/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. 
Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle.
Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of
its parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/
 
package com.Assignment;
public class Q25_inherit_rectangle {
	public static class rectangle{
		float l,b;
		rectangle(float l,float b) {
			this.l=l;
			this.b=b;
			
		}
		public float area() {
			return l*b;
		}
		public float perimeter() {
			return (l*b)*2;
	    }
	}
		
	 public static class square extends rectangle{
		float s;
		square(float l, float b,float s) {
			super(l, b);
			this.s=s;
		}		 
		 public float areaS() {
				return s*s;
		 }
		 public float perimeterS() {
				return 4*s;
		 }
	 }
	 
	public static void main(String[] args) {
		square s=new square(3,4,5);
		System.out.println("Rectangle Area: "+s.area());
		System.out.println("Square Area: "+s.areaS());
		System.out.println("Square Perimeter: "+s.perimeter());
		System.out.println("Rectangle Perimeter: "+s.perimeterS());
	}
}
