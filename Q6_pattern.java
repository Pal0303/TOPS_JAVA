/*Write a program in Java to display the pattern like right angle triangle with a number. 
12 
123 
1234 
12345

1 
2 3 
4 5 6 
7 8 9 10
*/

package com.Assignment;

import java.util.Scanner;

public class Q6_pattern {
	public static void main(String[] args) {
        int n,i,j,num=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(+j);
            }
             System.out.println(" ");
        }
        
        System.out.println(".............");
        
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(+num+" ");
                num++;
            }
             System.out.println(" ");
        }

    }       

}
