//W.A.J.P to get the character at the given index within the String. Original String = Tops Technologies! The character at position 0 is T, The character at position 10 is o 
//W.A.J.P to concatenate a given string to the end of another string. 
package com.Assignment;

import java.util.Scanner;

public class Q13_Q14_String {
	public static void main(String[] args) {
        String s;
        String a="Hello";
        String b="World";
        int i;
        System.out.println("Enter a String:");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        System.out.println("Enter index of String:");
        i=sc.nextInt();
        System.out.println(s.charAt(i));
        b=a+" "+b;
        System.out.println(b);

    }

}
