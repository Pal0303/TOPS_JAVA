/*Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real
and imaginary parts are entered by user.*/

package com.Assignment;

import java.util.Scanner;

public class Q27_complexNum {
	public static class complex{
		int a,b,c,d;
		complex(){
			System.out.println("Enter real part of first complex number:");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			System.out.println("Enter fractional part of first complex number:");
			b=sc.nextInt();
			System.out.println("Enter real part of second complex number:");
			c=sc.nextInt();
			System.out.println("Enter fractional part of second complex number:");
			d=sc.nextInt();
		}
		
		public void sum() {
			int sum1,sum2;
			sum1=a+c;
			sum2=b+d;
			System.out.println("sum is: "+sum1+"+"+sum2+"i");
		}
		public void sub() {
			int sub1,sub2;
			sub1=a-c;
			sub2=b-d;
			System.out.println("sub is: "+sub1+"+("+sub2+")i");
		}
		public void product() {
			int p1,p2;
			p1=(a*c)-(b*d);
			p2=(a*d)-(b*c);
			System.out.println("sub is: "+p1+"+("+p2+")i");
		}
	}
	
	public static void main(String[] args) {
		complex c=new complex();
		c.sum();
		c.sub();
		c.product();
	}
}
