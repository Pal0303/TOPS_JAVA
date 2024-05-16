/*Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class".
Now, create an object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of
child class 3 - method of parent class by object of child class*/

package com.Assignment;

public class Q23_parent_child {
	
	public static class parent_class{
		public void method1() {
			System.out.println("This is a parent class");
		}
	}
	
	public static class subClass extends parent_class{
		public void method2() {
			System.out.println("This is child class");
		}
	}
	
	public static void main(String[] args) {
		parent_class p=new parent_class();
		subClass s=new subClass();
		p.method1();
		s.method2();
		s.method1();
	}
}
