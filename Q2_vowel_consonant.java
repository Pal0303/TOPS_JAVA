//Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message. 

package com.Assignment;

import java.util.Scanner;

public class Q2_vowel_consonant {
    public static void main(String[] args) {
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        c=sc.next().charAt(0);
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
            System.out.println("Vowel");
        }
        else{
            if(c<=90 && c>=65 || c>=97 && c<=122){
                System.out.println("Consonant");
            }
            else{
                System.out.println("Not a letter");
            }
        }
    }

}
