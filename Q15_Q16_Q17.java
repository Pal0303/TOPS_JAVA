//W.A.J.P to compare a given string to the specified character sequence. Comparing topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
//W.A.J.P to check whether a given string ends with the contents of another string. "Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
//W.A.J.P to check whether a given string starts with the contents of another string. Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts with Red? False I3.

package com.Assignment;

public class Q15_Q16_Q17 {
	
public boolean compareString(String s,String sc) {
	if(s.equals(sc)) {
		return true;
	}
	return false;
}

public boolean endContent(String s,String end) {
	if(s.endsWith(end)){
		return true;
	}
	return false;
}

public boolean startContent(String s,String start) {
	if(s.startsWith(start)){
		return true;
	}
	return false;
}

public static void main(String[] args) {
	Q15_Q16_Q17 q=new Q15_Q16_Q17();
	System.out.println(q.compareString("topsint.com","Topsint.com"));
	System.out.println(q.compareString("topsint.com","topsint.com"));
	
	System.out.println(q.endContent("Java Exercises","es"));
	System.out.println(q.endContent("Java Exercises","se"));
	
	System.out.println(q.startContent("Red is favorite color","Red"));
	System.out.println(q.startContent("Red is favorite color","Orange"));
	
}

}
