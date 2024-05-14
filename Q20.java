//Create a class named 'Print Number' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for each data type.
package com.Assignment;

public class Q20 {
	
	public static class print_number{
		
		public int printn(int n) {
			return n;
		}
		public float printn(float n) {
			return n;
		}
		public long printn(long n) {
			return n;
		}
		public char printn(char n) {
			return n;
		}
		
	}
	
    public static void main(String[] args) {
	print_number p=new print_number();
	System.out.println(p.printn(10));
	System.out.println(p.printn(2.5f));
	System.out.println(p.printn('p'));
	System.out.println(p.printn(123456789L));
    }
}
