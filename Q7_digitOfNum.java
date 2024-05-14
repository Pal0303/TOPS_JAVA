//Write a Java program that reads a positive integer and count the number of digits the number. 
package com.Assignment;

import java.util.Scanner;

public class Q7_digitOfNum {
	public static void main(String[] args) {
        int n,num,rev=0,r,i=0;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        num=n;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
            i++;
        }
        System.out.println("Number of digits in the number:"+i);
    }       
}
