/*Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks Grade
1-100  A
1-90   B
1-80   B
1-70   C
1-60   D
41-50 DD
40 Fail*/

package com.Assignment;

import java.util.Scanner;

public class Q33_marks {
	
	public static void checkMarks(int m) {
		if(m<=100 && m>90) {
			System.out.println("'A' Grade");
		}
		else if(m<=90 && m>80) {
			System.out.println("'B' Grade");
		}
		else if(m<=80 && m>70) {
			System.out.println("'C' Grade");
		}
		else if(m<=70 && m>60) {
			System.out.println("'D' Grade");
		}
		else if(m<=60 && m>50) {
			System.out.println("'DD' Grade");
		}
		else if(m<=50 && m>=0) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Marks");
		}

	}
	
	public static void main(String[] args) {
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		marks=sc.nextInt();
		Q33_marks.checkMarks(marks);
	}
}
