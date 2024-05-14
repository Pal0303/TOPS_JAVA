//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both. 
package com.Assignment;

public class Q12_divisibleby_3_5_both {
	public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5!=0){
                System.out.println(i+" is divisible by 3");
            }
            else if(i%5==0 && i%3!=0){
                System.out.println(i+" is divisible by 5");
            }
            else if(i%3==0 && i%5==0){
                System.out.println(i+" is divisible by both");
            }
        }
    }

}
