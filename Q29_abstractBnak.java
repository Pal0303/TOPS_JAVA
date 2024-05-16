/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.*/

package com.Assignment;

public class Q29_abstractBnak {
	public static abstract class bank{
		public abstract int getBalance(int b);
	}
	
	public static class bankA extends bank{

		public int getBalance(int b) {
			return b;
		}
		
	}
	
	public static class bankB extends bank{

		public int getBalance(int b) {
			return b;
		}
		
	}
	
	public static class bankC extends bank{

		public int getBalance(int b) {
			return b;
		}
		
	}
	
	public static void main(String[] args) {
		bankA a=new bankA();
		bankB b=new bankB();
		bankC c=new bankC();
		System.out.println("Deposited amount in bank A: $"+a.getBalance(100));
		System.out.println("Deposited amount in bank B: $"+b.getBalance(150));
		System.out.println("Deposited amount in bank C: $"+c.getBalance(200));
	}
}
