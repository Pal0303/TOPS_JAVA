//Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop. 
package com.Assignment;

import java.util.Scanner;

public class Q5_sum_avg {
    public static void main(String[] args) {
        int i,sum=0,avg;
        int[] arr=new int[5];
        System.out.println("Enter Five numbers:");
        Scanner sc=new Scanner(System.in);
        
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        
        avg=sum/5;
        System.out.println("sum:"+sum+" avg:"+avg);
    }       

}
