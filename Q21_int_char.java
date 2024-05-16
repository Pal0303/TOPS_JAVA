/*Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters. For
example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).*/
package com.Assignment;

public class Q21_int_char {
	public class printIntChar{
		public static void print1(int n,char c) {
			System.out.println("integer is: "+n+" Character is: "+c);
		}
		public static void print2(char c,int n) {
			System.out.println("integer is: "+n+" Character is: "+c);
		}
	}
	
	public static void main(String[] args) {
		printIntChar.print1(1, 'p');
		printIntChar.print2('a', 2);
	}
}
