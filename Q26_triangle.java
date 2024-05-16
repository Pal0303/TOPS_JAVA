//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter
//in its constructor.

package com.Assignment;

public class Q26_triangle {
	public static class triangle{
		float a,b,c;
		triangle(){
			this.a=3;
			this.b=4;
			this.c=5;
		}
		public float area() {
			return (float) (0.5*a*b);
		}
		public float perimeter() {
			return a+b+c;
		}
		
	}
	
	public static void main(String[] args) {
		triangle t=new triangle();
		System.out.println("Area is: "+t.area());
		System.out.println("perimeter is: "+t.perimeter());
	}
}
