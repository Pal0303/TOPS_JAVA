/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints
"This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.*/

package com.Assignment;
public class Q28_parentAbstract {
	public static abstract class parent{
		public abstract void method1();
	}
	
	public static class subclass1 extends parent{

		public void method1() {
			System.out.println("This is first subclass");
		}
		
	}
	
    public static class subclass2 extends parent{

		public void method1() {
			System.out.println("This is second subclass");
		}
		
	}
	
	public static void main(String[] args) {
		subclass1 s1=new subclass1();
		subclass2 s2=new subclass2();
		s1.method1();
		s2.method1();
	}
}
