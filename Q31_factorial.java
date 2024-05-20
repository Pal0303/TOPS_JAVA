/*Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n. E.g.- 4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0*/

package com.Assignment;

public class Q31_factorial {
	public static int factorial(int n) {
		int fact=1;
		if(n==0) {
			fact=0;
		}
		else if(n==1) {
			fact=1;
		}
		else if(n<0) {
			System.out.println("negative numbers not allowed");
		}
		else {
            for(int i=2;i<=n;i++) {
                fact=fact*i;
            }
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println("Factorial is: "+Q31_factorial.factorial(4));
	}
}
