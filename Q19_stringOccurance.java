//W.A.J.P to find the second most frequent character in a given string. The given string is: successes The second most frequent char in the string is: c
package com.Assignment;

public class Q19_stringOccurance {
	
public static char occuranceString(String s) {
	char c='\0';
	int visited=-1,i,j,count,max=0,secondMax=0;
	char[] arr=s.toCharArray();
	int[] fr=new int[arr.length];
	
	for(i=0;i<arr.length;i++) {
		count=0;
		for(j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				fr[i]=visited;
			}
		}
		if(fr[i]!=visited) {
			fr[i]=count;
		}
	}
	
	 for(i=0;i<arr.length;i++){
		 if(fr[i]!=0) { 
			 
         
         }
     }
	 
	return c;
}
	
public static void main(String[] args) {
	System.out.println(Q19_stringOccurance.occuranceString("successes"));
}

}
