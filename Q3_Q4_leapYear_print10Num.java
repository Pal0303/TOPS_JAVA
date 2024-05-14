//Write a Java program that takes a year from user and print whether that year is a leap year or not. 
//Write a program in Java to display the first 10 natural numbers using while loop. 

package com.Assignment;
import java.util.Scanner;

public class Q3_Q4_leapYear_print10Num {
    public static void main(String[] args) {
        int yr, i=1;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year:");
        yr=sc.nextInt();
        if(yr>=1000 && yr<=9999){
            if(yr%4==0 || yr%100==0 && yr%400==0){
                System.out.println("Leap year");
            }
            else{
                System.out.println("Not a Leap year");
            }
        }
        else{
            System.out.println("Enter valid year");
        }
        
        
        while(i<=10){
            System.out.println(+i);
            i++;
        }
       
    }

}
