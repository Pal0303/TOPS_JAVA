//Write a Java program to display the system time. 
package com.Assignment;

import java.util.*;

public class Q11_display_time {
	public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        Date currentDate = new Date(currentTimeMillis);
        System.out.println("Current System Time: " + currentDate);
    }
}
