//Write a Java program to Take three numbers from the user and print the greatest number. 

package com.Assignment;
import java.util.Scanner;

public class Q1_greatest_three {
	
	    public static void main(String[] args) {
	        int n1,n2,n3;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter three numbers:");
	        n1=sc.nextInt();
	        n2=sc.nextInt();
	        n3=sc.nextInt();
	        if(n1>n2){
	            if(n1>n3){
	                System.out.println(+n1+" is Greatest");
	            }
	            else{
	                System.out.println(+n3+" is Greatest");
	            }
	        }
	        else{
	            if(n2>n3){
	                System.out.println(+n2+" is Greatest");
	            }
	            else{
	                System.out.println(+n3+" is Greatest");
	            }
	        }
	    }

}
