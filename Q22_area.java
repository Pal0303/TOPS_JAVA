/*Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for 
printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter 
which is side of square.*/

package com.Assignment;

public class Q22_area {
	public class area{
		public static void areaShape(float l, float b) {
			float area=l*b;
			System.out.println("Area of rectangle is: "+area);
		}
        public static void areaShape(float l) {
        	float area=l*l;
			System.out.println("Area of square is: "+area);
		}
		
	}
	
	public static void main(String[] args) {
		area.areaShape(5);
		area.areaShape(5, 4);
	}
}
