/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B.
Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same
name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four 
subjects as its parameters for student B. Create an object for each of the two classes and print the percentage of marks for both the students.*/

package com.Assignment;

public class Q30_marks {
	
	public static abstract class marks{
		public abstract float getPercentage();
	}
	
	public static class A extends marks{
		int math,sci,eng;
		A(int math, int sci, int eng){
			this.math=math;
			this.sci=sci;
			this.eng=eng;
		}
		

		@Override
		public float getPercentage() {
			float per;
			per=(math+sci+eng)/3;
			return per;
		}
		
	}
	public static class B extends marks{
        int math,sci,eng,hindi;
		B(int math, int sci, int eng,int hindi){
			this.math=math;
			this.sci=sci;
			this.eng=eng;
			this.hindi=hindi;
		}
		

		@Override
		public float getPercentage() {
			float per;
			per=(math+sci+eng+hindi)/4;
			return per;
		}
		
	}
	
	public static void main(String[] args) {
		A a=new A(55,78,89);
		B b=new B(67,89,34,93);
		System.out.println("Studet A percentage: "+a.getPercentage());
		System.out.println("Studet B percentage: "+b.getPercentage());
		
	}
}
