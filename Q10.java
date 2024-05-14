//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Input number: 5 
//5 + 55 + 555

package com.Assignment;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
        int n,n1,n2,sum;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n1=(n*10)+n;
        n2=(n*100)+n1;
        sum=n+n1+n2;
        System.out.println(+n+" + "+n1+" + "+n2);
        System.out.println("sum:"+sum);
    }       

}
