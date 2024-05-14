//Write a Java program to count the letters, spaces, numbers and other characters of an input string. 
//Write a Java program to print the ASCII value of a given character. 

package com.Assignment;

import java.util.Scanner;

public class Q8_Q9_ascii_countString {
	public static void main(String[] args) {
        String s;
        int l=0,sp=0,d=0,o=0;
        char c;
        System.out.println("Enter a String:");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)<=90 && s.charAt(i)>=65 || s.charAt(i)<=122 && s.charAt(i)>=97){
            l++;
        }
        else if(s.charAt(i)<=57 && s.charAt(i)>=48){
            d++;
        }
        else if(s.charAt(i)==32){
            sp++;
        }
        else{
            o++;
        }
        }
        System.out.println("Total letters:"+l+" spaces:"+sp+" numbers:"+d+" other characters:"+o);
        
        System.out.println("Enter a Character:");
        c=sc.next().charAt(0);
        System.out.println("ASCII value of given character is:"+(int)c);

        
    }       

}
